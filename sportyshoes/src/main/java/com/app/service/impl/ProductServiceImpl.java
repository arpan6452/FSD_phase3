package com.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.model.Products;
import com.app.repository.ProductRepository;
import com.app.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	ProductRepository productRepository;

	@Override
	public Products createProduct(Products products) {
		return productRepository.save(products);
	}

	@Override
	public Products updateProduct(int productid, Products products) {
		Products updatedProduct = productRepository.findById(productid).get();
		updatedProduct.setProductName(products.getProductName());
		updatedProduct.setProductCategory(products.getProductCategory());
		updatedProduct.setColor(products.getColor());
		updatedProduct.setSize(products.getSize());
		updatedProduct.setPrice(products.getPrice());
		return productRepository.save(updatedProduct);
	}

	@Override
	public Products searchProductById(int id) {
		return productRepository.findById(id).get();
	}

	@Override
	public List<Products> getAllProducts() {
		return productRepository.findAll();
	}

	@Override
	public List<Products> findbyproductCategory(String category) {
		return productRepository.findByproductCategory(category);
	}

	@Override
	public List<Products> findbysize(float size) {
		return productRepository.findBysize(size);
	}

	@Override
	public void deleteProduct(int id) {
		productRepository.deleteById(id);
	}
	
	


}
