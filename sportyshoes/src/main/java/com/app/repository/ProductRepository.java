package com.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.model.Products;

@Repository
public interface ProductRepository extends JpaRepository<Products, Integer> {
	
	public List<Products> findByproductCategory(String category);
	public List<Products> findBysize(float size);
}
