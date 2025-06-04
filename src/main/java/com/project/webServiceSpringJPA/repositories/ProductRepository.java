package com.project.webServiceSpringJPA.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.webServiceSpringJPA.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
