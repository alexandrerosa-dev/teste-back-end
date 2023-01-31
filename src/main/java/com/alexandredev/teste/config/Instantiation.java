package com.alexandredev.teste.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.alexandredev.teste.entities.Address;
import com.alexandredev.teste.entities.User;
import com.alexandredev.teste.repository.AddressRepository;
import com.alexandredev.teste.repository.UserRepository;

@Configuration
public class Instantiation implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private AddressRepository addressRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		userRepository.deleteAll();
		addressRepository.deleteAll();
		
		User maria = new User(null, "Maria Brown", "06/09/1986");
		User alex = new User(null, "Alex Green", "17/09/1992");
		User bob = new User(null, "Bob Grey", "31/01/1990");
		
		Address mainAddress = new Address(null, "Rua Esther Costa", "23064-410", 8, "Rio de Janeiro", maria);
		Address secondaryAddress = new Address(null, "Rua Andorinha", "23064-240", 23, "Rio de Janeiro", maria);
		
		
		userRepository.saveAll(Arrays.asList(maria, alex, bob));
		addressRepository.saveAll(Arrays.asList(mainAddress, secondaryAddress));
	}

	
}
