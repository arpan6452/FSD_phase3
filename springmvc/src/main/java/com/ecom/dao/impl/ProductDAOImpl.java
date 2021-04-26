package com.ecom.dao.impl;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.ecom.dao.ProductDAO;
import com.ecom.dao.mapper.ProductMappper;
import com.ecom.model.Product;

public class ProductDAOImpl implements ProductDAO {

	private JdbcTemplate template;
	private DataSource dataSource;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.template = new JdbcTemplate(this.dataSource);
	}

	public Product createProduct(Product product) {
		String sql = "insert into product(productId,cost,productName) values(?,?,?)";
		template.update(sql, product.getProductId(), product.getCost(), product.getProductName());
		return product;
	}

	public Product getProductById(int id) {
		String sql = "select productId,cost,productName from product where productId=?";
		Product product = template.queryForObject(sql, new Object[] {id}, new ProductMappper());
		return product;
	}

	public Product updateProduct(Product product) {
		// TODO Auto-generated method stub
		return null;
	}

	public void deleteteProduct(int id) {
		// TODO Auto-generated method stub

	}

	public List<Product> getAllProducts() {
		String sql = "select productId,cost,productName from product";
		List<Product> playerList = template.query(sql, new ProductMappper());
		return playerList;
	}

	public List<Product> geProductByName(String productName) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Product> getProductByCost(double cost) {
		// TODO Auto-generated method stub
		return null;
	}

}
