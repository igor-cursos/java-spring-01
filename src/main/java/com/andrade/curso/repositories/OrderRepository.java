package com.andrade.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andrade.curso.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
}
