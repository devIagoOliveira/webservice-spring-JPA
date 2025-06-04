package com.project.webServiceSpringJPA.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.webServiceSpringJPA.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
