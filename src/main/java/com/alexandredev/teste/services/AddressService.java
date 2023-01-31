package com.alexandredev.teste.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alexandredev.teste.entities.Address;
import com.alexandredev.teste.repository.AddressRepository;
import com.alexandredev.teste.services.exception.ObjectNotFoundException;

@Service
public class AddressService {

	@Autowired
	private AddressRepository repository;
	
	public List<Address> findAll() {
		return repository.findAll();
	}
	
	public Address findById(Long id) {
		Optional<Address> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
		}
	
	
	public Address insert(Address obj) {
		return repository.save(obj);
	}
	
	public void delete(Long id) {
		findById(id);
		repository.deleteById(id);
	}
	
}
