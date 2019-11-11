package com.cmv.technology.ecommerce.core.repository;

import com.cmv.technology.ecommerce.core.model.entity.OrderCargoStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderCargoStatusRepository extends JpaRepository<OrderCargoStatus, Long> {

    @Query("select s from OrderCargoStatus s " +
            "join fetch s.order " +
            "where s.order.id=:orderId")
    List<OrderCargoStatus> findByOrderId(@Param("orderId") Long orderId);

}
