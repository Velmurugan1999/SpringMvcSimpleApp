package com.spr.mvc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan("com.spr.mvc")
public class SpringConfig {
	/*@Bean
	public ViewResolver viewResolver() {
		InternalResourceViewResolver view=new InternalResourceViewResolver();
		view.setPrefix("WEB-INF/view/");
		view.setSuffix(".jsp");
		
		return view;
		
	}*/
	 
}
