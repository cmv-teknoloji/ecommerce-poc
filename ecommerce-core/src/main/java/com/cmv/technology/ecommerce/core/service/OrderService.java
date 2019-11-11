package com.cmv.technology.ecommerce.core.service;

import com.cmv.technology.ecommerce.common.dto.cargo.OrderDto;
import com.cmv.technology.ecommerce.core.mapper.OrderMapper;
import com.cmv.technology.ecommerce.core.model.entity.Order;
import com.cmv.technology.ecommerce.core.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderService{

    private final OrderRepository orderRepository;

    public List<Order> findAll(Boolean cargoCompleted){
        if(cargoCompleted == null){
            return orderRepository.findAll();
        }else{
            return orderRepository.findByCargoCompleted(cargoCompleted);
        }
    }

    public void saveOrder(OrderDto dto){
        orderRepository.save(OrderMapper.mapTo(dto));
    }

}