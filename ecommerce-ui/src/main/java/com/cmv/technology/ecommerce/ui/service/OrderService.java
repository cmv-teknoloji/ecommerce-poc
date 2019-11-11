package com.cmv.technology.ecommerce.ui.service;

import com.cmv.technology.ecommerce.common.dto.cargo.OrderCargoStatusDto;
import com.cmv.technology.ecommerce.common.dto.cargo.OrderDto;
import lombok.AllArgsConstructor;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
@AllArgsConstructor
public class OrderService {

    private final OrderCargoService orderCargoService;

    private final RestTemplate restTemplate;

    private final LoadBalancerClient loadBalancer;

    public List<OrderDto> getAllOrders() {

        ServiceInstance instance = loadBalancer.choose("ECOMMERCE-CORE");
        URI uri = instance.getUri();
        String newPath = uri.getPath() + "/order";
        URI newUri = uri.resolve(newPath);
        ResponseEntity<OrderDto[]> responseEntity = restTemplate.getForEntity(newUri, OrderDto[].class);
        OrderDto[] orderDtos = responseEntity.getBody();
        return Arrays.asList(orderDtos);
    }

    public void sendToCargo(OrderDto orderDto) {
        orderCargoService.createShipmentFromWS(orderDto);
    }

    public List<OrderCargoStatusDto> getCargoStatusHistory(OrderDto orderDto) {
        return orderCargoService.getCargoStatusHistory(orderDto);
    }
}
