package cd.pipeline.runner.internal;

import cd.pipeline.util.ServiceLookupException;

public interface ServiceRegistry {

    /**
     * Locates the service of the given type.
     *
     * @param serviceType The service type.
     * @param <T>         The service type.
     * @return The service instance. Never returns null.
     * @throws UnknownServiceException                 When there is no service of the given type available.
     * @throws cd.pipeline.util.ServiceLookupException On failure to lookup the specified service.
     */
    <T> T get(Class<T> serviceType) throws ServiceLookupException;
}
