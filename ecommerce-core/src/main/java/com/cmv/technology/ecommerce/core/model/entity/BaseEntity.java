package com.cmv.technology.ecommerce.core.model.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@MappedSuperclass
@Data
public class BaseEntity {

    @Id
    @GeneratedValue
    private Long id;

    private LocalDateTime createDate;

    private LocalDateTime updateDate;

    @PrePersist
    public void prePersist(){
        createDate = LocalDateTime.now();
    }

    @PreUpdate
    public void preUpdate(){
        updateDate = LocalDateTime.now();
    }
}
