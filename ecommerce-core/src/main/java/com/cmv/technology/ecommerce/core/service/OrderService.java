package com.cmv.technology.ecommerce.core.service;

import com.cmv.technology.ecommerce.common.dto.cargo.OrderDto;
import com.cmv.technology.ecommerce.core.mapper.OrderMapper;
import com.cmv.technology.ecommerce.core.model.entity.Order;
import com.cmv.technology.ecommerce.core.repository.OrderRepository;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Service
public class OrderService extends BaseService {

    private final OrderRepository orderRepository;

    private final RestTemplate restTemplate;

    public OrderService(final LoadBalancerClient loadBalancer,
                        final RestTemplate restTemplate,
                        final OrderRepository orderRepository) {
        super(loadBalancer);
        this.restTemplate = restTemplate;
        this.orderRepository = orderRepository;
    }

    public List<Order> findAll(Boolean cargoCompleted) {
        if (cargoCompleted == null) {
            return orderRepository.findAll();
        } else {
            return orderRepository.findByCargoCompleted(cargoCompleted);
        }
    }

    public void saveOrder(OrderDto dto) {
        ResponseEntity<Boolean> shipmentCreated = restTemplate.postForEntity(getUri("/shipment"), dto, Boolean.class);
        dto.setCargoCreateDate(LocalDateTime.now());
        if(Boolean.TRUE.equals(shipmentCreated.getBody())){
            orderRepository.save(OrderMapper.mapTo(dto));
        }else{

        }
    }
}