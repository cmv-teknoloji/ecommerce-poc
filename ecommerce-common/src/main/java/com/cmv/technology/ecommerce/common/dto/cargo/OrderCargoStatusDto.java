package com.cmv.technology.ecommerce.common.dto.cargo;

import java.util.Date;

public class OrderCargoStatusDto {

    private Long id;

    private OrderDto order;

    private String orderId;

    private String cargoFirm;

    private String status;

    private Date statusChangeDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public OrderDto getOrder() {
        return order;
    }

    public void setOrder(OrderDto order) {
        this.order = order;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getCargoFirm() {
        return cargoFirm;
    }

    public void setCargoFirm(String cargoFirm) {
        this.cargoFirm = cargoFirm;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getStatusChangeDate() {
        return statusChangeDate;
    }

    public void setStatusChangeDate(Date statusChangeDate) {
        this.statusChangeDate = statusChangeDate;
    }

    @Override
    public String toString() {
        return "OrderCargoStatusDto{" +
                "id=" + id +
                ", order=" + order +
                ", cargoFirm='" + cargoFirm + '\'' +
                ", status='" + status + '\'' +
                ", statusChangeDate=" + statusChangeDate +
                '}';
    }
}
