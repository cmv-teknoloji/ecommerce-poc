package com.cmv.technology.ecommerce.cargo.controller;

import com.cmv.technology.ecommerce.common.dto.cargo.OrderCargoStatusDto;
import com.cmv.technology.ecommerce.common.dto.cargo.OrderDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient("shipment")
public interface ICargoClientController {

    @RequestMapping(method = RequestMethod.POST, value = "/shipment")
    boolean createShipment(OrderDto orderDto) throws Exception;

    @RequestMapping(method = RequestMethod.POST, value = "/shipment/query")
    List<OrderCargoStatusDto> queryShipment(List<OrderDto> orderDtos) throws Exception;

}
