package com.app.backend.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.app.backend.entities.Laboratory;
import com.app.backend.repository.LaboratoryRepository;

@RestController
public class LaboratoryController {
	
	private LaboratoryRepository laboratoryRepository;
	
	public LaboratoryController(LaboratoryRepository laboratoryRepository) {
		this.laboratoryRepository=laboratoryRepository;
	}

	@GetMapping("/laboratories")
	public List<Laboratory> getAllLaboratory(){
		return laboratoryRepository.findAll();
	}
	
	@GetMapping("/laboratoire/{id}")
	public Laboratory findLaboratoryById(@PathVariable long id) {
		return laboratoryRepository.findById(id).get();
	}
}
