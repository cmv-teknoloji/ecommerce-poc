package com.cmv.technology.ecommerce.core.model.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table
@Data
public class OrderCargoStatus {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    private Order order;

    private String orderId;

    private String cargoFirm;

    private String status;

    private Date statusChangeDate;

}
