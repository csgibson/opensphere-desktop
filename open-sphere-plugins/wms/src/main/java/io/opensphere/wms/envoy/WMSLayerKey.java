package io.opensphere.wms.envoy;

/**
 * The Class WMSLayerKey.
 */
public class WMSLayerKey
{
    /** The LAYER_SEPARATOR. */
    public static final String LAYERNAME_SEPARATOR = "!!";

    /** My layer name. */
    private final String myLayerName;

    /** My server name. */
    private final String myServerName;

    /**
     * Creates a key from the server name and the layer name.
     *
     * @param serverName the server name
     * @param layerName the layer name
     * @return the string
     */
    public static String createKey(String serverName, String layerName)
    {
        StringBuilder builder = new StringBuilder();
        if (serverName != null && !serverName.isEmpty())
        {
            builder.append(serverName).append(LAYERNAME_SEPARATOR);
        }
        builder.append(layerName);
        return builder.toString();
    }

    /**
     * Instantiates a new WMSLayerKey from an existing layerKey string.
     *
     * @param layerKey the layer key
     */
    public WMSLayerKey(String layerKey)
    {
        String[] components = layerKey.split(LAYERNAME_SEPARATOR);
        if (components.length >= 2)
        {
            myServerName = components[0];
            myLayerName = components[1];
        }
        else
        {
            myServerName = null;
            myLayerName = layerKey;
        }
    }

    /**
     * Instantiates a new WMSLayerKey from a server and layer name.
     *
     * @param serverName the server name
     * @param layerName the layer name
     */
    public WMSLayerKey(String serverName, String layerName)
    {
        myServerName = serverName;
        myLayerName = layerName;
    }

    /**
     * Gets the key that uniquely identifies a layer.
     *
     * @return the layer key
     */
    public String getLayerKey()
    {
        return createKey(myServerName, myLayerName);
    }

    /**
     * Gets the layer name.
     *
     * @return the layer name
     */
    public String getLayerName()
    {
        return myLayerName;
    }

    /**
     * Gets the server name.
     *
     * @return the server name
     */
    public String getServerName()
    {
        return myServerName;
    }

    @Override
    public String toString()
    {
        return createKey(myServerName, myLayerName);
    }
}
