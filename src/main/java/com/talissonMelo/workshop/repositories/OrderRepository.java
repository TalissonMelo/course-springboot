package com.talissonMelo.workshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.talissonMelo.workshop.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
