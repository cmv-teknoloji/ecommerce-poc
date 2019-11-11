package com.cmv.technology.ecommerce.core.service;

import com.cmv.technology.ecommerce.common.dto.cargo.OrderCargoStatusDto;
import com.cmv.technology.ecommerce.core.mapper.OrderCargoStatusMapper;
import com.cmv.technology.ecommerce.core.model.entity.Order;
import com.cmv.technology.ecommerce.core.model.entity.OrderCargoStatus;
import com.cmv.technology.ecommerce.core.repository.OrderCargoStatusRepository;
import com.cmv.technology.ecommerce.core.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class OrderCargoStatusService {

    private OrderCargoStatusRepository orderCargoStatusRepository;

    private OrderRepository orderRepository;

    public List<OrderCargoStatusDto> getByOrderId(Long orderId) {
        return OrderCargoStatusMapper.mapTo(orderCargoStatusRepository.findByOrderId(orderId));
    }

    public void updateStatus(List<OrderCargoStatusDto> orderCargoStatusDtos) {
        for (OrderCargoStatusDto orderCargoStatusDto : orderCargoStatusDtos) {
            Optional<OrderCargoStatus> orderCargoStatusOptional = orderCargoStatusRepository.findByOrderIdAndStatus(
                    Long.valueOf(orderCargoStatusDto.getOrderId()),
                    orderCargoStatusDto.getStatus());

            if (orderCargoStatusOptional.isPresent()) {
                continue;
            }
            OrderCargoStatus orderCargoStatus = new OrderCargoStatus();
            Optional<Order> orderOptional = orderRepository.findById(Long.valueOf(orderCargoStatusDto.getOrderId()));
            orderOptional.ifPresent(order -> {
                order.setCargoLastStatus(orderCargoStatusDto.getStatus());
                orderRepository.save(order);
                orderCargoStatus.setOrder(order);
            });

            orderCargoStatus.setOrderId(orderCargoStatusDto.getOrderId());
            orderCargoStatus.setStatus(orderCargoStatusDto.getStatus());
            orderCargoStatusRepository.save(orderCargoStatus);
        }
    }
}