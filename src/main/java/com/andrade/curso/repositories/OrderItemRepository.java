package com.andrade.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andrade.curso.entities.OrderItem;
import com.andrade.curso.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {
	
}
