package com.ait.cars;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement
@Table(name = "car")
public class Car {

	@Id
	@Column(name = "id")
	private int id;
	
	@Column(name = "make")
	private String make;
	
	@Column(name = "model")
	private String model;
	
	@Column(name = "year")
	private int year;
	
	@Column(name = "color")
	private String color;
	
	@Column(name = "litre")
	private double litre;
	
	@Column(name = "mileage")
	private int mileage;
	
	@Column(name = "price")
	private int price;
	
	@Column(name = "image")
	private String image;
	
	@Column(name = "cond")
	private String condition;
	
	@Column(name = "seller")
	private String seller;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getLitre() {
		return litre;
	}

	public void setLitre(double litre) {
		this.litre = litre;
	}

	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}

	public String getSeller() {
		return seller;
	}

	public void setSeller(String seller) {
		this.seller = seller;
	}
	
}
