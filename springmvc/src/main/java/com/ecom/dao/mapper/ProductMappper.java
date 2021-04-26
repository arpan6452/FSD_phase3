package com.ecom.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.ecom.model.Product;

public class ProductMappper implements RowMapper<Product> {

	public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
		Product product = new Product();
		product.setProductId(rs.getInt("productId"));
		product.setCost(rs.getDouble("cost"));
		product.setProductName(rs.getString("productName"));		
		return product;
	}

}
