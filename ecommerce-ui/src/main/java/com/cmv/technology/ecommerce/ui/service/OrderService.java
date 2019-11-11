package com.cmv.technology.ecommerce.ui.service;

import com.cmv.technology.ecommerce.common.dto.cargo.OrderCargoStatusDto;
import com.cmv.technology.ecommerce.common.dto.cargo.OrderDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
@Slf4j
public class OrderService extends BaseService {

    private final OrderCargoService orderCargoService;

    private final RestTemplate restTemplate;

    public OrderService(final LoadBalancerClient loadBalancer,
                        final RestTemplate restTemplate,
                        final OrderCargoService orderCargoService) {
        super(loadBalancer);
        this.orderCargoService = orderCargoService;
        this.restTemplate = restTemplate;
    }

    public List<OrderDto> getAllOrders() {
        ResponseEntity<OrderDto[]> responseEntity = restTemplate.getForEntity(getUri("/order"), OrderDto[].class);
        OrderDto[] orderDtos = responseEntity.getBody();
        log.info(String.valueOf(orderDtos));
        return Arrays.asList(orderDtos);
    }

    public void sendToCargo(OrderDto orderDto) {
        restTemplate.put(getUri("/order"), orderDto);
    }

    public List<OrderCargoStatusDto> getCargoStatusHistory(OrderDto orderDto) {
        return orderCargoService.getCargoStatusHistory(orderDto);
    }
}
