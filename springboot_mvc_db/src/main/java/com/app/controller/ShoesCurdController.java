package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.exception.RecordNotFoundException;
import com.app.model.Shoes;
import com.app.service.ShoesCurdService;
import com.app.service.impl.ShoesCurdServiceImpl;

import net.bytebuddy.implementation.bytecode.Throw;

@RestController
public class ShoesCurdController {
	
	@Autowired
	private ShoesCurdService shoesCrudService;

	@PostMapping("/shoes")
	public Shoes createShoes(@RequestBody Shoes shoes) {
		return shoesCrudService.createShoes(shoes);
	}

	@PutMapping("/shoes")
	public Shoes updateShoes(@RequestBody Shoes shoes) {
		return shoesCrudService.updateShoes(shoes);
	}

	@GetMapping("/shoes/{id}")
	public Shoes getShoesById(@PathVariable int id) {
		Shoes shoes = shoesCrudService.getShoesById(id);
		if(shoes == null) {
	         throw new RecordNotFoundException("Invalid employee id : " + id);
	    }
		return shoes;
	}

	@DeleteMapping("/shoes/{id}")
	public void deleteShoesById(@PathVariable int id) {
		System.out.println("Here goes the id:"+ id);
		shoesCrudService.deleteShoesById(id);
	}

}
