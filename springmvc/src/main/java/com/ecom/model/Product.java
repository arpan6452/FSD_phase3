package com.ecom.model;

public class Product {
	private int productId;
	private double cost;
	private String productName;

	public Product() {
		
	}
	
	// private String Category;
	public Product(int productId, double cost, String productName) {
		super();
		this.productId = productId;
		this.cost = cost;
		this.productName = productName;
	}
	
	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	@Override
	public String toString() {
		return "Products [productId=" + productId + ", cost=" + cost + ", productName=" + productName + "]";
	}
}
