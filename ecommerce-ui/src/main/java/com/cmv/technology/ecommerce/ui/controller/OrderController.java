package com.cmv.technology.ecommerce.ui.controller;

import com.cmv.technology.ecommerce.common.dto.cargo.OrderCargoStatusDto;
import com.cmv.technology.ecommerce.common.dto.cargo.OrderDto;
import com.cmv.technology.ecommerce.ui.service.OrderService;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.List;

@Controller
@Data
@RequiredArgsConstructor
@Slf4j
public class OrderController {

    private List<OrderDto> orders = new ArrayList<>();

    private List<OrderCargoStatusDto> cargoStatuses = new ArrayList<>();

    private final OrderService orderService;

    public void init() {
        getAllOrders();
    }

    public void getAllOrders() {
        orders = orderService.getAllOrders();
    }

    public void sendToCargo(OrderDto orderDto) {
        log.info("Order Id: " + orderDto.getId());
        orderService.sendToCargo(orderDto);
    }

    public void showCargoStatusHistory(OrderDto orderDto) {
        cargoStatuses = orderService.getCargoStatusHistory(orderDto);
    }
}
