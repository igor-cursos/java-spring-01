package com.andrade.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andrade.curso.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
