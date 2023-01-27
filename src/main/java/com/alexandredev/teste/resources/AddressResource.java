package com.alexandredev.teste.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alexandredev.teste.entities.Address;

@RestController
@RequestMapping(value = "/addresses")
public class AddressResource {

	@GetMapping
	public ResponseEntity<Address> findAll() {
		Address a = new Address(1L, "Rua Esther Pereira da Costa", "23064-410", 8, "Rio de Janeiro");
		return ResponseEntity.ok().body(a);
	}
}
