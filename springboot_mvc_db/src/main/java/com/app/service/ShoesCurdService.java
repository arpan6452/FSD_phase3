package com.app.service;

import com.app.model.Shoes;

public interface ShoesCurdService {
	public Shoes createShoes(Shoes shoes);
	public Shoes updateShoes(Shoes shoes);
	public Shoes getShoesById(int id);
	public void deleteShoesById(int id);
}
