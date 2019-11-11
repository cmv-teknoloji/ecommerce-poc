package com.cmv.technology.ecommerce.ui.controller;

import com.cmv.technology.ecommerce.common.dto.cargo.OrderCargoStatusDto;
import com.cmv.technology.ecommerce.common.dto.cargo.OrderDto;
import com.cmv.technology.ecommerce.ui.service.OrderService;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Controller
@Data
@RequiredArgsConstructor
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
        orderService.sendToCargo(orderDto);
    }

    public void showCargoStatusHistory(OrderDto orderDto) {
        cargoStatuses = orderService.getCargoStatusHistory(orderDto);
    }
}
