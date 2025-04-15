package com.example.demo2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.demo2.messenger.Messenger;

@Service
public class ServiceMain {

	@Autowired
	@Qualifier("mess")
	private Messenger message;
	
	@Autowired
	private Common common;
	
	
	public void testApp2() {
		System.out.println(common.commonTest());
		message.test();
	}
	
}
