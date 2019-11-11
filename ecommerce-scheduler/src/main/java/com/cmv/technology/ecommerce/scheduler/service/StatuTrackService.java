package com.cmv.technology.ecommerce.scheduler.service;

import com.cmv.technology.ecommerce.common.dto.cargo.OrderCargoStatusDto;
import com.cmv.technology.ecommerce.common.dto.cargo.OrderDto;
import org.apache.commons.lang.ArrayUtils;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

@Service
public class StatuTrackService extends BaseService {

    private final RestTemplate restTemplate;

    public StatuTrackService(final LoadBalancerClient loadBalancer,
                             final RestTemplate restTemplate) {
        super(loadBalancer);
        this.restTemplate = restTemplate;
    }


    public void queryNonCompletedOrders() {
        ResponseEntity<OrderDto[]> responseEntity = restTemplate.getForEntity(getCoreUri("/order?cargoCompleted=false"), OrderDto[].class);
        OrderDto[] notCompletedOrders = responseEntity.getBody();
        ResponseEntity<OrderCargoStatusDto[]> newStatus = restTemplate.postForEntity(getCargoUri("/shipment/query"), notCompletedOrders, OrderCargoStatusDto[].class);
         restTemplate.postForEntity(getCoreUri("/orderCargoStatus/updateStatu"), newStatus, Object.class);

    }

}
