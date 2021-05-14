package com.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Entity
@Table
@ApiModel(description="All the details about Shoes")
public class Products {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@ApiModelProperty(notes = "ID of the Shoe.It is the primery key and auto generated.",name="productID",required=true,value="1")
	private int productID;
	@ApiModelProperty(notes = "Name of the Shoe.",name="productName",required=true,value="Nike")
	private String productName;
	@ApiModelProperty(notes = "Category of the Shoe.",name="productCategory",required=true,value="Running")
	private String productCategory;
	@ApiModelProperty(notes = "Color of the Shoe.",name="white",required=true,value="white")
	private String color;
	@ApiModelProperty(notes = "Size of the Shoe.",name="size",required=true,value="6.5")
	private float size;
	@ApiModelProperty(notes = "Price of the Shoe..",name="price",required=true,value="2599.00")
	private double price;
	
	public int getProductID() {
		return productID;
	}

	public void setProductID(int productID) {
		this.productID = productID;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public float getSize() {
		return size;
	}

	public void setSize(float size) {
		this.size = size;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Products [productID=" + productID + ", productName=" + productName + ", productCategory="
				+ productCategory + ", color=" + color + ", size=" + size + ", price=" + price + "]";
	}

}
