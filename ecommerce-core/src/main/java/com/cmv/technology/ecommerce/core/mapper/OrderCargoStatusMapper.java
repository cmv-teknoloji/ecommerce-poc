package com.cmv.technology.ecommerce.core.mapper;

import com.cmv.technology.ecommerce.common.dto.cargo.OrderCargoStatusDto;
import com.cmv.technology.ecommerce.core.model.entity.OrderCargoStatus;

import java.util.List;
import java.util.stream.Collectors;

public class OrderCargoStatusMapper {

    public static List<OrderCargoStatusDto> mapTo(List<OrderCargoStatus> orderCargoStatusList) {
        return orderCargoStatusList.stream().map(OrderCargoStatusMapper::mapTo).collect(Collectors.toList());
    }

    public static OrderCargoStatusDto mapTo(OrderCargoStatus orderCargoStatus) {
        if (orderCargoStatus == null) {
            return null;
        }
        OrderCargoStatusDto orderCargoStatusDto = new OrderCargoStatusDto();
        orderCargoStatusDto.setCargoFirm(orderCargoStatus.getCargoFirm());
        orderCargoStatusDto.setId(orderCargoStatus.getId());
        orderCargoStatusDto.setOrder(OrderMapper.mapTo(orderCargoStatus.getOrder()));
        orderCargoStatusDto.setStatus(orderCargoStatus.getStatus());
        orderCargoStatusDto.setStatusChangeDate(orderCargoStatus.getStatusChangeDate());
        return orderCargoStatusDto;
    }
}
