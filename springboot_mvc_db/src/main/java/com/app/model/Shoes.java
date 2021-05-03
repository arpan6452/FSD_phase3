package com.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table
/*
 * @Setter
 * 
 * @Getter
 * 
 * @ToString
 * 
 * @NoArgsConstructor
 */
public class Shoes {

	@Id
	@GeneratedValue
	private int id;
	private String name;
	private double price;
	private String category;
	private String color;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Shoes [id=" + id + ", name=" + name + ", price=" + price + ", category=" + category + ", color=" + color
				+ "]";
	}
	
	

}
