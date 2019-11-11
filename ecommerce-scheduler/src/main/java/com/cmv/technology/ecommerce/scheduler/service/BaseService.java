package com.cmv.technology.ecommerce.scheduler.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;

import java.net.URI;

@RequiredArgsConstructor
@Slf4j
public class BaseService {

    private final LoadBalancerClient loadBalancer;

    protected URI getCoreUri(String path) {
        return getUri(path, "ECOMMERCE-CORE");
    }

    protected URI getCargoUri(String path) {
        return getUri(path, "ECOMMERCE-CARGO");
    }

    private URI getUri(String path, String serviceId) {
        ServiceInstance instance = loadBalancer.choose(serviceId);
        URI uri = instance.getUri();
        String newPath = uri.getPath() + path;
        log.info(newPath);
        return uri.resolve(newPath);
    }

}
