package com.cmv.technology.ecommerce.core.mapper;

import com.cmv.technology.ecommerce.common.dto.cargo.OrderDto;
import com.cmv.technology.ecommerce.core.model.entity.Order;

import java.util.List;
import java.util.stream.Collectors;

public class OrderMapper {


    public static List<OrderDto> mapTo(List<Order> orders) {
        return orders.stream().map(OrderMapper::mapTo).collect(Collectors.toList());
    }

    public static OrderDto mapTo(Order order) {
        if (order == null) {
            return null;
        }
        OrderDto orderDto = new OrderDto();
        orderDto.setCargoCompleted(order.getCargoCompleted());
        orderDto.setCargoCreateDate(order.getCargoCreateDate());
        orderDto.setCargoFirm(orderDto.getCargoFirm());
        orderDto.setCargoLastStatus(orderDto.getCargoLastStatus());
        orderDto.setCargoOrderId(orderDto.getCargoOrderId());
        orderDto.setId(orderDto.getId());
        orderDto.setCargoTrackingUrl(orderDto.getCargoTrackingUrl());
        return orderDto;
    }
}
