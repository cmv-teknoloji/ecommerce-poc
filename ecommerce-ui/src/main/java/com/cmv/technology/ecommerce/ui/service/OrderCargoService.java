package com.cmv.technology.ecommerce.ui.service;

import com.cmv.technology.ecommerce.common.dto.cargo.OrderCargoStatusDto;
import com.cmv.technology.ecommerce.common.dto.cargo.OrderDto;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class OrderCargoService extends BaseService {

    private final RestTemplate restTemplate;

    public OrderCargoService(final LoadBalancerClient loadBalancer,
                             final RestTemplate restTemplate) {
        super(loadBalancer);
        this.restTemplate = restTemplate;
    }

    public List<OrderCargoStatusDto> getCargoStatusHistory(OrderDto order) {
        ResponseEntity<OrderCargoStatusDto[]> responseEntity = restTemplate.getForEntity(getUri("/orderCargoStatus?orderId=" + order.getId()), OrderCargoStatusDto[].class);
        OrderCargoStatusDto[] orderCargoStatusDtos = responseEntity.getBody();
        return Arrays.asList(orderCargoStatusDtos);
    }

}
