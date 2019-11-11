package com.cmv.technology.ecommerce.core.model.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table
@Data
@EqualsAndHashCode(callSuper = true)
public class OrderCargoStatus extends BaseEntity {

    @ManyToOne(fetch = FetchType.LAZY)
    private Order order;

    private String cargoKey;

    private String cargoFirm;

    private String status;

    private LocalDateTime statusChangeDate;

}
