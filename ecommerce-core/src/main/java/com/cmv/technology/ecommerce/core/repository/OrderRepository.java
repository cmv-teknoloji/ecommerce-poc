package com.cmv.technology.ecommerce.core.repository;

import com.cmv.technology.ecommerce.core.model.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

    public List<Order> findByCargoCompletedFalse();

}