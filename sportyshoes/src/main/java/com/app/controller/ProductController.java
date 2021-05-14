package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Products;
import com.app.service.ProductService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RestController
//@RequestMapping(value="/api")

@Api(value="Product Controller", description="This is a Product Controller API, you can get, create, update and delete product.")
public class ProductController{

	@Autowired
	ProductService productService;
	
	@ApiOperation("You can create a new product.")
	@PostMapping("/product")
	public Products createProduct(@RequestBody Products products) {
		return productService.createProduct(products);
	}

	@ApiOperation("You can update a product, based on the product id you provide.")
	@PutMapping("/product/{id}")
	public Products updateProduct(@PathVariable int id, @RequestBody Products products) {
		return productService.updateProduct(id, products);
	}

	@ApiOperation("You can fetch a product, based on the product id you provide.")
	@GetMapping("/product/{id}")
	public Products searchProductById(@PathVariable int id) {
		return productService.searchProductById(id);
	}
	
	@ApiOperation("Find the list of all products.")
	@GetMapping("/products")
	public List<Products> getAllUsers() {		
		return productService.getAllProducts();
	}

	@ApiOperation("Find the list of all products based on the shoe catagory you provide.")
	@GetMapping("/products/category/{category}")
	public List<Products> findbyproductCategory(@PathVariable String category) {
		return productService.findbyproductCategory(category);
	}

	@ApiOperation("Find the list of all products based on the shoe size you provide.")
	@GetMapping("/products/size/{size}")
	public List<Products> findbysize(@PathVariable String size) {
		return productService.findbysize(Float.parseFloat(size));
	}

	@DeleteMapping("/product/{id}")
	public void deleteProduct(@PathVariable int id) {
		productService.deleteProduct(id);
	}

}

//@ApiParam(value="Id of the product which will be updated.", required = true)@ApiParam(value="Details of the product which will be updated.", required = true)@ApiParam(value="Id of the product which you want ot fetch.", required = true)
