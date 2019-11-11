package com.cmv.technology.ecommerce.common.dto.cargo;

import java.time.LocalDateTime;
import java.util.Date;

public class OrderDto {

    private Long id;

    private String cargoOrderId;

    private String cargoFirm;

    private LocalDateTime cargoCreateDate;

    private String cargoTrackingUrl;

    private String cargoLastStatus;

    private Boolean cargoCompleted;

    private Date cargoLastStatusDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCargoOrderId() {
        return cargoOrderId;
    }

    public void setCargoOrderId(String cargoOrderId) {
        this.cargoOrderId = cargoOrderId;
    }

    public String getCargoFirm() {
        return cargoFirm;
    }

    public void setCargoFirm(String cargoFirm) {
        this.cargoFirm = cargoFirm;
    }

    public LocalDateTime getCargoCreateDate() {
        return cargoCreateDate;
    }

    public void setCargoCreateDate(LocalDateTime cargoCreateDate) {
        this.cargoCreateDate = cargoCreateDate;
    }

    public String getCargoTrackingUrl() {
        return cargoTrackingUrl;
    }

    public void setCargoTrackingUrl(String cargoTrackingUrl) {
        this.cargoTrackingUrl = cargoTrackingUrl;
    }

    public String getCargoLastStatus() {
        return cargoLastStatus;
    }

    public void setCargoLastStatus(String cargoLastStatus) {
        this.cargoLastStatus = cargoLastStatus;
    }

    public Boolean getCargoCompleted() {
        return cargoCompleted;
    }

    public void setCargoCompleted(Boolean cargoCompleted) {
        this.cargoCompleted = cargoCompleted;
    }

    public Date getCargoLastStatusDate() {
        return cargoLastStatusDate;
    }

    public void setCargoLastStatusDate(Date cargoLastStatusDate) {
        this.cargoLastStatusDate = cargoLastStatusDate;
    }

    @Override
    public String toString() {
        return "OrderDto{" +
                "id=" + id +
                ", cargoOrderId='" + cargoOrderId + '\'' +
                ", cargoFirm='" + cargoFirm + '\'' +
                ", cargoCreateDate=" + cargoCreateDate +
                ", cargoTrackingUrl='" + cargoTrackingUrl + '\'' +
                ", cargoLastStatus='" + cargoLastStatus + '\'' +
                ", cargoCompleted=" + cargoCompleted +
                ", cargoLastStatusDate=" + cargoLastStatusDate +
                '}';
    }
}
