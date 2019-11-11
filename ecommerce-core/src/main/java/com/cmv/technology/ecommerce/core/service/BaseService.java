package com.cmv.technology.ecommerce.core.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;

import java.net.URI;

@RequiredArgsConstructor
@Slf4j
public class BaseService {

    private final LoadBalancerClient loadBalancer;

    protected URI getUri(String path) {
        ServiceInstance instance = loadBalancer.choose("ECOMMERCE-CARGO");
        URI uri = instance.getUri();
        String newPath = uri.getPath() + path;
        log.info(newPath);
        return uri.resolve(newPath);
    }

}
