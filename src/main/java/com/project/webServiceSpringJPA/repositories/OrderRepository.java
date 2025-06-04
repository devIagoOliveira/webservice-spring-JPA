package com.project.webServiceSpringJPA.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.webServiceSpringJPA.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
