package com.example.demo1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo2.service.ServiceMain;
import com.example.demo3.service.AppServiceMain;

import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;
@RestController
public class MyCotroller {

	@Autowired
	ServiceMain sm;
	
	@Autowired
	AppServiceMain sn;
	
	@GetMapping("/test")
	public void test() {
		StandardPBEStringEncryptor encryptor = new StandardPBEStringEncryptor();
        encryptor.setAlgorithm("PBEWithMD5AndDES");
        encryptor.setPassword("PBEWithMD5AndDES");

        String encryptedText = "uD25pFAeqBOimYt2qLqwBA2Qcya5TIHx60JMsMt54bM=";
        String decrypted = encryptor.decrypt(encryptedText);

        System.out.println("Decrypted Text: " + decrypted);
	}
}
