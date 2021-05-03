package com.app.service.impl;

import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.app.model.Shoes;
import com.app.service.ShoesCurdService;

@Service
public class ShoesCurdServiceImpl implements ShoesCurdService {

	private String url = "http://localhost:8000/shoes/";
	private RestTemplate template = new RestTemplate();

	@Override
	public Shoes createShoes(Shoes shoes) {
		return template.postForObject(url, shoes, Shoes.class);
	}

	@Override
	public Shoes updateShoes(Shoes shoes) {
		template.put(url, shoes);
		return shoes;
	}

	@Override
	public Shoes getShoesById(int id) {
		ResponseEntity<Shoes> entity = template.exchange(url + id, HttpMethod.GET, null, Shoes.class);
		return entity.getBody();
	}

	@Override
	public void deleteShoesById(int id) {
		template.delete(url + id);
	}

}
