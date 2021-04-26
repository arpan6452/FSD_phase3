package com.ecom.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ecom.dao.ProductDAO;
import com.ecom.model.Product;

public class ProductController {
	public List<Product> getAllProducts() {
		ApplicationContext context = new ClassPathXmlApplicationContext("productbeans.xml");
		ProductDAO dao = (ProductDAO) context.getBean("productDAO");		
		List<Product> products = dao.getAllProducts();
		return products;
	}
}
