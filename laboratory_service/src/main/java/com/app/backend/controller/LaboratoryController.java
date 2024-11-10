package com.app.backend.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.backend.entities.Laboratory;
import com.app.backend.repository.LaboratoryRepository;

@RestController
@RequestMapping("/laboratory") 
public class LaboratoryController {
	
	private LaboratoryRepository laboratoryRepository;
	
	public LaboratoryController(LaboratoryRepository laboratoryRepository) {
		this.laboratoryRepository=laboratoryRepository;
	}

	@GetMapping("/all")
	public List<Laboratory> getAllLaboratory(){
		return laboratoryRepository.findAll();
	}
	
	@GetMapping("/{id}")
	public Laboratory findLaboratoryById(@PathVariable long id) {
		return laboratoryRepository.findById(id).get();
	}
}
