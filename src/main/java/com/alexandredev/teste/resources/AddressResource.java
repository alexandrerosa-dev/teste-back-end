package com.alexandredev.teste.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alexandredev.teste.entities.Address;
import com.alexandredev.teste.services.AddressService;

@RestController
@RequestMapping(value = "/addresses")
public class AddressResource {

	@Autowired
	private AddressService service;
	
	@GetMapping
	public ResponseEntity<List<Address>> findAll() {
		List<Address> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Address> findById(@PathVariable Long id) {
		Address obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
	
	@PostMapping
	public ResponseEntity<Address> insert(@RequestBody Address obj) {
		obj = service.insert(obj);
		return ResponseEntity.ok().body(obj);
	}
	
}
