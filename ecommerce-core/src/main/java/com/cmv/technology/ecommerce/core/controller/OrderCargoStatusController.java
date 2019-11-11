package com.cmv.technology.ecommerce.core.controller;

import com.cmv.technology.ecommerce.common.dto.cargo.OrderCargoStatusDto;
import com.cmv.technology.ecommerce.core.controller.interfaces.IOrderCargoStatusController;
import com.cmv.technology.ecommerce.core.service.OrderCargoStatusService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class OrderCargoStatusController implements IOrderCargoStatusController {

    private final OrderCargoStatusService orderCargoStatusService;

    @Override
    public List<OrderCargoStatusDto> findByOrderId(Long orderId) {
        return orderCargoStatusService.getByOrderId(orderId);
    }
}
