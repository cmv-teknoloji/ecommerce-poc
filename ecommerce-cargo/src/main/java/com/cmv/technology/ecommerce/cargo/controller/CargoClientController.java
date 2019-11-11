package com.cmv.technology.ecommerce.cargo.controller;

import com.cmv.technology.ecommerce.cargo.controller.interfaces.ICargoClientController;
import com.cmv.technology.ecommerce.common.dto.cargo.OrderCargoStatusDto;
import com.cmv.technology.ecommerce.common.dto.cargo.OrderDto;
import com.cmv.technology.ecommerce.cargo.service.CreateShipmentService;
import com.cmv.technology.ecommerce.cargo.service.QueryShipmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class CargoClientController implements ICargoClientController {

    private final CreateShipmentService cargoClientService;

    private final QueryShipmentService queryShipmentService;

    @Override
    public boolean createShipment(OrderDto orderDto) throws Exception {
        return cargoClientService.createShipment(orderDto);
    }

    @Override
    public List<OrderCargoStatusDto> queryShipment(ArrayList<OrderDto> orderDtos) throws Exception {
        return queryShipmentService.queryShipment(orderDtos);
    }
}
