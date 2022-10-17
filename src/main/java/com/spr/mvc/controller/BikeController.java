package com.spr.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.spr.mvc.pojo.Bike;

//@Controller
public class BikeController {

	@RequestMapping(path="/")
	public String getDetails()
	{
		System.out.println(new Bike(11,"Yamaha","Black",150,40).toString());
		return "index";
	}
	@RequestMapping("/bike")
	public ModelAndView getBike()
	{
		ModelAndView model=new ModelAndView();
		System.out.println("Get Bike called.............");
		model.addObject("greeting", "Welcome!!!!!!!!!!!!!!");
		model.addObject("tagline", "Welcome to bike store>>>");
		model.setViewName("bike");
		return model;
	}
}
