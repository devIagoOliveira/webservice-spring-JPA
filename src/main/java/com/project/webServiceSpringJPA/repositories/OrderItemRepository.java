package com.project.webServiceSpringJPA.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.webServiceSpringJPA.entities.OrderItem;
import com.project.webServiceSpringJPA.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{

}
