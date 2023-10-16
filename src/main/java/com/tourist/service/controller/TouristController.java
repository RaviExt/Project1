package com.tourist.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tourist.service.entity.Tourist;
import com.tourist.service.repository.TouristRepository;

@RestController
@CrossOrigin(origins="http://localhost:64779/")
public class TouristController {
	
	@Autowired
	private TouristRepository repo;
	
	
	@PostMapping("tourist")
	public ResponseEntity<Tourist> registerTourist(@RequestBody Tourist tourist) {
		
		System.out.println("Controller called");
		return ResponseEntity.ok(repo.save(tourist));
	}

}
