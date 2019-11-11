package com.cmv.technology.ecommerce.core.repository;

import com.cmv.technology.ecommerce.core.model.entity.OrderCargoStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface OrderCargoStatusRepository extends JpaRepository<OrderCargoStatus, Long> {

    @Query("select s from OrderCargoStatus s " +
            "join fetch s.order " +
            "where s.order.id=:orderId")
    List<OrderCargoStatus> findByOrderId(@Param("orderId") Long orderId);

    @Query("select distinct s from OrderCargoStatus s " +
            "join fetch s.order " +
            "where s.order.id=:orderId and s.status=:status")
    Optional<OrderCargoStatus> findByOrderIdAndStatus(@Param("orderId") Long orderId, @Param("status") String status);

}
