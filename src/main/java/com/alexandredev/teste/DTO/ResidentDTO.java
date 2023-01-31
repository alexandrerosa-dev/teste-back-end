package com.alexandredev.teste.DTO;

import java.io.Serializable;

import com.alexandredev.teste.entities.User;

public class ResidentDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String name;
	
	public ResidentDTO() {
	}
	
	public ResidentDTO(User obj) {
		id = obj.getId();
		name = obj.getName();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
