package com.app.service;

import java.util.List;

import com.app.model.Products;

public interface ProductService {
	
	public Products createProduct(Products products);
	public Products updateProduct(int productid, Products products);
	public Products searchProductById(int id);
	public List<Products> getAllProducts();
	public List<Products> findbyproductCategory(String category);
	public List<Products> findbysize(float size);
	public void deleteProduct(int id);
}
