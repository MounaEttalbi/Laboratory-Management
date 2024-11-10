package com.app.backend.client;
import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.app.backend.model.Laboratory;

@FeignClient(name = "laboratory-service")
public interface LaboratoryRestClient {
	
	@GetMapping("/laboratory/{id}")
	Laboratory findLaboratoryById(@PathVariable Long id) ;
	
	@GetMapping("/laboratory/all")
	List<Laboratory> allLaboratory();

}
