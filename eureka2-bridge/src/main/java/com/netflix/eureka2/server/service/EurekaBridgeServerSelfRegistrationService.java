package com.netflix.eureka2.server.service;

import com.netflix.eureka2.registry.SourcedEurekaRegistry;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * @author David Liu
 */
@Singleton
public class EurekaBridgeServerSelfRegistrationService extends EurekaWriteServerSelfRegistrationService {

    @Inject
    public EurekaBridgeServerSelfRegistrationService(SelfInfoResolver resolver, SourcedEurekaRegistry registry) {
        super(resolver, registry);
    }

    @Override
    public void cleanUpResources() {
        // no-op
    }
}
