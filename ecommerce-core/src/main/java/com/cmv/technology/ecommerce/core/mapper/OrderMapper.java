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
        orderDto.setCargoFirm(order.getCargoFirm());
        orderDto.setCargoLastStatus(order.getCargoLastStatus());
        orderDto.setCargoOrderId(order.getCargoOrderId());
        orderDto.setId(order.getId());
        orderDto.setCargoTrackingUrl(order.getCargoTrackingUrl());
        return orderDto;
    }



    public static Order mapTo(OrderDto orderDto) {
        if (orderDto == null) {
            return null;
        }
        Order order = new Order();
        order.setCargoCompleted(orderDto.getCargoCompleted());
        order.setCargoCreateDate(orderDto.getCargoCreateDate());
        order.setCargoFirm(orderDto.getCargoFirm());
        order.setCargoLastStatus(orderDto.getCargoLastStatus());
        order.setCargoOrderId(orderDto.getCargoOrderId());
        order.setId(orderDto.getId());
        order.setCargoTrackingUrl(orderDto.getCargoTrackingUrl());
        return order;
    }
}
