package com.andrade.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andrade.curso.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
}
