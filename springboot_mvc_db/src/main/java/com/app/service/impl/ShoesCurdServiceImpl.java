package com.app.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.model.Shoes;
import com.app.repository.ShoesRepository;
import com.app.service.ShoesCurdService;

@Service
public class ShoesCurdServiceImpl implements ShoesCurdService{

	@Autowired
	private ShoesRepository shoesRepository;
	
	@Override
	public Shoes createShoes(Shoes shoes) {
		return shoesRepository.save(shoes);
	}

	@Override
	public Shoes updateShoes(Shoes shoes) {
		return  shoesRepository.save(shoes);
	}

	@Override
	public Shoes getShoesById(int id) {
		return  shoesRepository.findById(id).get();
	}

	@Override
	public void deleteShoesById(int id) {
		shoesRepository.deleteById(id);
	}

}
