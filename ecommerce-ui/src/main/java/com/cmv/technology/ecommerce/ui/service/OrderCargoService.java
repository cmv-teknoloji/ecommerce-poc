package com.cmv.technology.ecommerce.ui.service;

import com.cmv.technology.ecommerce.common.dto.cargo.OrderCargoStatusDto;
import com.cmv.technology.ecommerce.common.dto.cargo.OrderDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderCargoService {

    public void createShipmentFromWS(OrderDto order) {
        // kafka create die at ya da core atsın.
    }


    public List<OrderCargoStatusDto> getCargoStatusHistory(OrderDto order) {
        List<OrderCargoStatusDto> r = new ArrayList<>();
        OrderCargoStatusDto e = new OrderCargoStatusDto();
        e.setCargoFirm("YURTICI");
        r.add(e);

        return r;
        // Burasi coredan gelcek
        //return orderCargoStatusRepository.findByOrder(order);
    }

}
