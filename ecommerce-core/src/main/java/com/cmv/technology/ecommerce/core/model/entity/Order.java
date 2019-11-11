package com.cmv.technology.ecommerce.core.model.entity;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "oorder")
@Data
public class Order {

    @Id
    @GeneratedValue
    private Long id;

    @Transient
    @JsonSerialize
    @Getter(AccessLevel.NONE)
    private String cargoOrderId;

    private String cargoFirm;

    private Date cargoCreateDate;

    private String cargoTrackingUrl;

    private String cargoLastStatus;

    private Boolean cargoCompleted = false;

    private Date cargoLastStatusDate;

    public String getCargoOrderId() {
        return "TCELL" + getId();
    }
}
