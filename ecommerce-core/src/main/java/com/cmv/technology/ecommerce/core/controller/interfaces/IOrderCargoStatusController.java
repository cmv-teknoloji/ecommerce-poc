package com.cmv.technology.ecommerce.core.controller.interfaces;

import com.cmv.technology.ecommerce.common.dto.cargo.OrderCargoStatusDto;
import com.cmv.technology.ecommerce.common.dto.cargo.OrderDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient("orderCargoStatus")
public interface IOrderCargoStatusController {

    @RequestMapping(method = RequestMethod.GET, value = "/orderCargoStatus")
    List<OrderCargoStatusDto> findByOrderId(@RequestParam("orderId") Long orderId);


}
