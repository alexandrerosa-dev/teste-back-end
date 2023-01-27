package com.alexandredev.teste.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alexandredev.teste.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
