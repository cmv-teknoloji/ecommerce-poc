package com.cmv.technology.ecommerce.core.controller.interfaces;

import com.cmv.technology.ecommerce.common.dto.cargo.OrderCargoStatusDto;
import com.cmv.technology.ecommerce.common.dto.cargo.OrderDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient("order")
public interface IOrderController {

    @RequestMapping(method = RequestMethod.GET, value = "/order")
    List<OrderDto> findAll(@RequestParam("cargoCompleted") Boolean cargoCompleted);


    @RequestMapping(method = RequestMethod.PUT, value = "/order")
    void saveOrder(OrderDto orderDto);

    @RequestMapping(method = RequestMethod.PUT, value = "/order/updateStatu")
    void updateStatus(List<OrderCargoStatusDto> orderDto);
}
