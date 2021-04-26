package com.ecom.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ecom.dao.ProductDAO;
import com.ecom.model.Product;

public class EcomMain {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("productbeans.xml");
		Product product = new Product();
		product.setProductId(5);
		product.setCost(30000.00);
		product.setProductName("Nike Football");

		ProductDAO dao = (ProductDAO) context.getBean("productDAO");
		System.out.println(dao.createProduct(product));
		List<Product> products = dao.getAllProducts();
		for(Product p: products) {
			System.out.println(p);
		}
	}
}
