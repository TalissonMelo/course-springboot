package com.talissonMelo.workshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.talissonMelo.workshop.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
