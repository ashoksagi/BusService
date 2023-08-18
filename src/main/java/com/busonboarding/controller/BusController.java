package com.busonboarding.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.busonboarding.domain.Bus;
import com.busonboarding.repo.BusRepository;



@RestController
public class BusController {
	
	@Autowired
	BusRepository repo;
	
	@GetMapping("/buses")
	public List<Bus> getAllBuses() {
		return repo.findAll();
	}

	@GetMapping("/buses/{id}")
	public  Optional<Bus> getBus(@PathVariable("id") int id) {
		
		return repo.findById(id);
		
		
	}
	@PostMapping("/buses")
	public Bus addNewB(@RequestBody Bus toBeAdded) {
		return repo.save(toBeAdded);	
	}
	
}
