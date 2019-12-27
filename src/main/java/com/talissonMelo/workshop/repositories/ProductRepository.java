package com.talissonMelo.workshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.talissonMelo.workshop.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
