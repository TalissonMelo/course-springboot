package com.talissonMelo.workshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.talissonMelo.workshop.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
