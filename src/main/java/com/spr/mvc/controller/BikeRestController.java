package com.spr.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.spr.mvc.service.ServiceCls;

@RestController
public class BikeRestController {
	
	@Autowired
	ServiceCls service;
	
	@GetMapping("/")
	public String welcome() {
		return "Welcome!!!!!!";
		
	}
	@GetMapping(path="/bike",produces=MediaType.APPLICATION_JSON_VALUE)
	public String getBike() {
		return (new Gson().toJson(service.getBike()));
	}
}
