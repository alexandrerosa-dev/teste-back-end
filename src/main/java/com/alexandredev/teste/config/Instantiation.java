package com.alexandredev.teste.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.alexandredev.teste.entities.User;
import com.alexandredev.teste.repository.UserRepository;

@Configuration
public class Instantiation implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		userRepository.deleteAll();
		
		User maria = new User(null, "Maria Brown", "06/09/1986"); //mudar para simpleDateFormat
		User alex = new User(null, "Alex Green", "17/09/1992");
		User bob = new User(null, "Bob Grey", "31/01/1990");
		
		userRepository.saveAll(Arrays.asList(maria, alex, bob));
	}

	
}
