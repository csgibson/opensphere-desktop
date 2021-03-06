package io.opensphere.core.quantify;

import java.util.Set;

import javafx.beans.property.BooleanProperty;

/**
 * An interface defining a service that collects and periodically sends metrics
 * to a remote location.
 */
public interface QuantifyService
{
    /**
     * Collects an instance of the metric identified by the key.
     *
     * @param key the metric key for which to collect the metric.
     */
    void collectMetric(String key);

    /**
     * The property used to maintain the enabled state of the plugin.
     *
     * @return the property in which the enabled state is tracked.
     */
    BooleanProperty enabledProperty();

    /**
     * Flushes, sends all collected metrics through the sender to the remote
     * collector. Also resets the internal metric store to empty so that metrics
     * will not be counted twice.
     */
    void flush();

    /**
     * Gets the set of senders to which metrics will be sent.
     *
     * @return the set of senders to which metrics will be sent.
     */
    Set<QuantifySender> getSenders();

    /** Terminates the service. */
    void close();
}
