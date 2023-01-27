package com.alexandredev.teste.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.alexandredev.teste.entities.User;
import com.alexandredev.teste.repository.UserRepository;

@Service
public class UserService {

	private UserRepository repository;
	
	public List<User> findAll() {
		return repository.findAll();
	}
	
	public User findById(Long id) {
		Optional<User> obj = repository.findById(id);
		return obj.get();
	}
	
	public User insert(User obj) {
		return repository.save(obj);
	}
}