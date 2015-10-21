package com.ujm.wi;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Vegetable {
	@Id
	@GeneratedValue
	private long id;
	
	private String name;
	
	private String color;
	
	private float price;
	
	public Vegetable() {
		
	}
	
	public Vegetable(String name, String color, float price) {
		setColor(color);
		setName(name);
		setPrice(price);
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

}
