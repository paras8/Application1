package com.example.demo2.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.example.demo2.service.Common;

@Configuration("appconfig2")
public class AppConfig {

	@Bean
	public Common common2() {
		return new Common();
	}

	//
	//This is comment


	public void abc(){
		System.out.println("abc");
	}
}
