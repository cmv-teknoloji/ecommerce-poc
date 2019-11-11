package com.cmv.technology.ecommerce.core.model.entity;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.AccessLevel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "oorder")
@Data
@EqualsAndHashCode(callSuper = true)
public class Order extends BaseEntity {

    @Transient
    @JsonSerialize
    @Getter(AccessLevel.NONE)
    private String cargoOrderId;

    private String cargoFirm;

    private LocalDateTime cargoCreateDate;

    private String cargoTrackingUrl;

    private String cargoLastStatus;

    private Boolean cargoCompleted = false;

    private LocalDateTime cargoLastStatusDate;

    public String getCargoOrderId() {
        return "TCELL" + getId();
    }
}
