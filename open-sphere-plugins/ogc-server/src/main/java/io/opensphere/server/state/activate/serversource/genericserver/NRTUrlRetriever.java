package io.opensphere.server.state.activate.serversource.genericserver;

import java.util.Collections;
import java.util.List;

import com.google.common.base.Preconditions;

import io.opensphere.core.Toolbox;
import io.opensphere.server.toolbox.ServerToolboxUtils;
import io.opensphere.server.toolbox.WFSLayerConfigurationManager;

/**
 * Gets the list of URLs contained in the WFS layer nodes within a state node.
 */
public class NRTUrlRetriever extends BaseUrlRetriever
{
    /**
     * The configuration manager through which WFS-related configurations are
     * accessed.
     */
    private WFSLayerConfigurationManager myLayerConfigurationManager;

    /**
     * Creates a new URL retriever using the supplied toolbox to access
     * application state.
     *
     * @param toolbox the toolbox through which application state is accessed.
     */
    public NRTUrlRetriever(Toolbox toolbox)
    {
        myLayerConfigurationManager = ServerToolboxUtils.getServerToolbox(toolbox).getLayerConfigurationManager();
    }

    /**
     * {@inheritDoc}
     *
     * @see io.opensphere.server.state.activate.serversource.genericserver.BaseUrlRetriever#getLayerPaths()
     */
    @Override
    protected List<String> getLayerPaths()
    {
        Preconditions.checkNotNull(myLayerConfigurationManager);
        Preconditions.checkState(myLayerConfigurationManager.isSupportedServer("nrt"));

        return Collections.singletonList(myLayerConfigurationManager.getConfigurationFromName("nrt").getStateXPath());
    }

    /**
     * {@inheritDoc}
     *
     * @see io.opensphere.server.state.activate.serversource.genericserver.BaseUrlRetriever#transformUrl(java.lang.String)
     */
    @Override
    protected String transformUrl(String url)
    {
        return url.replace("wps", "wfs");
    }
}
