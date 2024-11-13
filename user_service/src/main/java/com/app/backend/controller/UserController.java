package com.app.backend.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.backend.repository.UserRepository;
import com.app.backend.client.LaboratoryRestClient;
import com.app.backend.entities.User;
import com.app.backend.model.Laboratory;

@RestController
@RequestMapping("/user")
public class UserController {
	
	
	private UserRepository userRepository;
	private LaboratoryRestClient laboratoryRestClient;
	

	public UserController (UserRepository userRepository ,LaboratoryRestClient laboratoryRestClient) {
		this.userRepository = userRepository;
		this.laboratoryRestClient =laboratoryRestClient;
	}

	@GetMapping("/all")
	public List<User> getAllUsers(){
		return userRepository.findAll();
	}
	
	@GetMapping("/{id}")
	public User getUserById(@PathVariable String id) {
		User user= userRepository.findById(id).get();
		Laboratory laboratory = laboratoryRestClient.findLaboratoryById(user.getFkIdLaboratoire());
		user.setLaboratoire(laboratory);
		return user;
	}
}
