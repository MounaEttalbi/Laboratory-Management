package com.app.backend.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.app.backend.repository.UserRepository;
import com.app.backend.entities.User;

@RestController
public class UserController {
	
	private UserRepository userRepository;
	

	public UserController (UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	@GetMapping("/users")
	public List<User> getAllUsers(){
		return userRepository.findAll();
	}
	
	@GetMapping("/user/{id}")
	public User getUserById(@PathVariable String id) {
		return userRepository.findById(id).get();
	}
}
