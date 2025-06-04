package com.project.webServiceSpringJPA.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.webServiceSpringJPA.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
