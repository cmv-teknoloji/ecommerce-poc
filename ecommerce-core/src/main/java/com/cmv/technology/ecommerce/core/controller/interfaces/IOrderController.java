package com.cmv.technology.ecommerce.core.controller.interfaces;

import com.cmv.technology.ecommerce.common.dto.cargo.OrderDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient("order")
public interface IOrderController {

    @RequestMapping(method = RequestMethod.GET, value = "/order")
    List<OrderDto> findAll();


    @RequestMapping(method = RequestMethod.PUT, value = "/order")
    void saveOrder(OrderDto orderDto);
}
