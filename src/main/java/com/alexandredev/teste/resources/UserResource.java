package com.alexandredev.teste.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alexandredev.teste.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	
	@GetMapping
	public ResponseEntity<User> findAll() {
		User u = new User(1L, "ALexandre", "06/09/1986");
		return ResponseEntity.ok().body(u);
	}
	
}
