package com.spr.mvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spr.mvc.pojo.Bike;

@Service
public class ServiceCls {
	@Autowired
	Bike bike;
	public Bike getBike() {
		bike.setModelNo(10);
		bike.setBrand("Yamaha");
		bike.setColour("Black");
		bike.setTopSpeed(150);
		bike.setMileage(45);
		return bike;
	}
}
