package com.alexandredev.teste.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alexandredev.teste.DTO.UserDTO;
import com.alexandredev.teste.entities.User;
import com.alexandredev.teste.repository.UserRepository;
import com.alexandredev.teste.services.exception.ObjectNotFoundException;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;
	
	public List<User> findAll() {
		return repository.findAll();
	}
	
	public User findById(Long id) {
		Optional<User> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
		}
	
	
	public User insert(User obj) {
		return repository.save(obj);
	}
	
	public User fromDTO(UserDTO objDto) {
		return new User(objDto.getId(), objDto.getName(), objDto.getBirthDate());
	}
}
