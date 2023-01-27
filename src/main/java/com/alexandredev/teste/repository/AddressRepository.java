package com.alexandredev.teste.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alexandredev.teste.entities.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {

}
