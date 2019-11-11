package com.cmv.technology.ecommerce.core.service;

import com.cmv.technology.ecommerce.common.dto.cargo.OrderCargoStatusDto;
import com.cmv.technology.ecommerce.core.mapper.OrderCargoStatusMapper;
import com.cmv.technology.ecommerce.core.repository.OrderCargoStatusRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderCargoStatusService {

    private final OrderCargoStatusRepository orderCargoStatusRepository;

    public List<OrderCargoStatusDto> getByOrderId(Long orderId) {
        return OrderCargoStatusMapper.mapTo(orderCargoStatusRepository.findByOrderId(orderId));
    }
}