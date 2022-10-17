package com.spr.mvc.pojo;

import org.springframework.stereotype.Component;

@Component
public class Bike {
	private int modelNo;
	private String brand;
	private String colour;
	private int topSpeed;
	private int mileage;
	
	public Bike() {
		
	}
	
	public Bike(int modelNo, String brand, String colour, int topSpeed, int mileage) {
		this.modelNo = modelNo;
		this.brand = brand;
		this.colour = colour;
		this.topSpeed = topSpeed;
		this.mileage = mileage;
	}

	
	public int getModelNo() {
		return modelNo;
	}

	public void setModelNo(int modelNo) {
		this.modelNo = modelNo;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public int getTopSpeed() {
		return topSpeed;
	}

	public void setTopSpeed(int topSpeed) {
		this.topSpeed = topSpeed;
	}

	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}

	public String toString() {
		return "Model No.:"+this.getModelNo()+"    Brand:"+this.getBrand()+"    Colour:"+this.getColour()+
				"    Top Speed:"+this.getTopSpeed()+"    Mileage:"+this.getMileage();
	}
}
