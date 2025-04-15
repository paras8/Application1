package com.example.demo1;

import org.junit.jupiter.api.Test;
import org.springframework.modulith.core.ApplicationModules;

public class ModularityTest {

	ApplicationModules module = ApplicationModules.of(Application1Application.class);
	
	@Test
	public void veriify() {
		System.out.println(module.toString());
		
	}
}
