package com.talissonMelo.workshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.talissonMelo.workshop.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
