package io.opensphere.osm.server;

import org.apache.log4j.Logger;

import io.opensphere.core.Notify;
import io.opensphere.core.Notify.Method;
import io.opensphere.core.Toolbox;
import io.opensphere.core.cache.SimpleSessionOnlyCacheDeposit;
import io.opensphere.core.data.util.DataModelCategory;
import io.opensphere.core.image.Image;
import io.opensphere.core.model.GeographicBoundingBox;
import io.opensphere.core.model.LatLonAlt;
import io.opensphere.core.model.ZYXImageKey;
import io.opensphere.core.server.ServerProviderRegistry;
import io.opensphere.core.util.collections.New;
import io.opensphere.core.util.taskactivity.TaskActivity;
import io.opensphere.mantle.datasources.IDataSource;
import io.opensphere.mantle.datasources.impl.UrlDataSource;
import io.opensphere.osm.util.OSMUtil;
import io.opensphere.server.control.UrlServerSourceController;
import io.opensphere.server.customization.DefaultCustomization;
import io.opensphere.server.customization.ServerCustomization;
import io.opensphere.server.display.ServiceValidator;
import io.opensphere.server.toolbox.ServerSourceController;
import io.opensphere.xyztile.model.Projection;
import io.opensphere.xyztile.model.XYZServerInfo;
import io.opensphere.xyztile.model.XYZTileLayerInfo;
import io.opensphere.xyztile.transformer.XYZImageProvider;
import io.opensphere.xyztile.util.XYZTileUtils;

/** Open Street Map's {@link ServerSourceController}. */
public class OSMServerSourceController extends UrlServerSourceController
{
    /** Logger reference. */
    private static final Logger LOGGER = Logger.getLogger(OSMServerSourceController.class);

    /** The core toolbox. */
    private Toolbox myToolbox;

    @Override
    public void open(Toolbox toolbox, Class<?> prefsTopic)
    {
        myToolbox = toolbox;
        super.open(toolbox, prefsTopic);
    }

    @Override
    public IDataSource createNewSource(String typeName)
    {
        return new UrlDataSource("Open Street Map", getExampleUrl());
    }

    @Override
    protected String getExampleUrl()
    {
        return "http://osm.geointservices.io/osm_tiles_pc/{z}/{x}/{y}.png";
    }

    @Override
    protected ServerCustomization getServerCustomization()
    {
        return new DefaultCustomization("Open Street Map Server");
    }

    @Override
    protected ServiceValidator<UrlDataSource> getValidator(ServerProviderRegistry registry)
    {
        return new OSMServerSourceValidator(registry);
    }

    @Override
    protected boolean handleActivateSource(IDataSource source)
    {
        boolean pingSuccess = false;

        try (TaskActivity activity = TaskActivity.createActive(source.getName() + " is loading..."))
        {
            myToolbox.getUIRegistry().getMenuBarRegistry().addTaskActivity(activity);

            DataModelCategory category = XYZTileUtils.newLayersCategory(((UrlDataSource)source).getURL(), OSMUtil.PROVIDER);
            XYZServerInfo serverInfo = new XYZServerInfo(source.getName(), ((UrlDataSource)source).getURL());
            XYZTileLayerInfo layerInfo = null;
            if (serverInfo.getServerUrl().contains("osm_tiles_pc"))
            {
                layerInfo = new XYZTileLayerInfo(OSMUtil.PROVIDER, source.getName(), Projection.EPSG_4326, 2, false, 2,
                        serverInfo);
            }
            else
            {
                layerInfo = new XYZTileLayerInfo(OSMUtil.PROVIDER, source.getName(), Projection.EPSG_3857, 1, false, 5,
                        serverInfo);
            }

            XYZImageProvider imageProvider = new XYZImageProvider(myToolbox.getDataRegistry(), layerInfo);
            Image pingImage = null;
            pingImage = imageProvider
                    .getImage(new ZYXImageKey(2, 1, 5, new GeographicBoundingBox(LatLonAlt.createFromDegrees(0., 45.),
                            LatLonAlt.createFromDegrees(45., 90.))));
            pingSuccess = (pingImage != null);
            if (pingSuccess)
            {
                getToolbox().getDataRegistry().addModels(
                        new SimpleSessionOnlyCacheDeposit<>(category, XYZTileUtils.LAYERS_DESCRIPTOR, New.list(layerInfo)));
            }
            else
            {
                Notify.error("Failed to query OSM server: Could not establish connection during intial ping", Method.TOAST);
            }
        }
        return pingSuccess;
    }

    @Override
    protected void handleDeactivateSource(IDataSource source)
    {
        DataModelCategory category = XYZTileUtils.newLayersCategory(((UrlDataSource)source).getURL(), OSMUtil.PROVIDER);
        getToolbox().getDataRegistry().removeModels(category, false);
    }
}
