package com.cmv.technology.ecommerce.cargo.controller;

import com.cmv.technology.ecommerce.cargo.CargoClientService;
import com.cmv.technology.ecommerce.common.dto.cargo.OrderCargoStatusDto;
import com.cmv.technology.ecommerce.common.dto.cargo.OrderDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class CargoClientController implements ICargoClientController {

    private final CargoClientService cargoClientService;

    @Override
    public boolean createShipment(OrderDto orderDto) throws Exception {
        return cargoClientService.createShipment(orderDto);
    }

    @Override
    public List<OrderCargoStatusDto> queryShipment(List<OrderDto> orderDtos) throws Exception {
        return cargoClientService.queryShipment(orderDtos);
    }
}
