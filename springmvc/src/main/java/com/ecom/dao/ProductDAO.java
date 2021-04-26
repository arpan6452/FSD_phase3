package com.ecom.dao;

import java.util.List;

import com.ecom.model.Product;

public interface ProductDAO {

	public Product createProduct(Product product);
	public Product getProductById(int id);
	public Product updateProduct(Product product);
	public void deleteteProduct(int id);
	public List<Product> getAllProducts();
	public List<Product> geProductByName(String productName);
	public List<Product> getProductByCost(double cost);	
	
}
