package com.cmv.technology.ecommerce.core.controller;

import com.cmv.technology.ecommerce.common.dto.cargo.OrderDto;
import com.cmv.technology.ecommerce.core.controller.interfaces.IOrderController;
import com.cmv.technology.ecommerce.core.mapper.OrderMapper;
import com.cmv.technology.ecommerce.core.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class OrderController implements IOrderController {

    private final OrderService orderService;

    public List<OrderDto> findAll(Boolean cargoCompleted) {
        return OrderMapper.mapTo(orderService.findAll(cargoCompleted));
    }

    @Override
    public void saveOrder(@RequestBody OrderDto orderDto) {
        orderService.saveOrder(orderDto);
    }

}
