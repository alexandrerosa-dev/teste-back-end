package com.alexandredev.teste.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.alexandredev.teste.entities.Address;
import com.alexandredev.teste.repository.AddressRepository;

@Service
public class AddressService {

	private AddressRepository repository;
	
	public List<Address> findAll() {
		return repository.findAll();
	}
	
	public Address findById(Long id) {
		Optional<Address> obj = repository.findById(id);
		return obj.get();
	}
}
