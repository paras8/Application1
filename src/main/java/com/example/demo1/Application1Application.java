package com.example.demo1;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.modulith.Modulithic;

import com.example.demo2.service.ServiceMain;

@ComponentScan(basePackages = {"com.example.demo1","com.example.demo2","com.example.demo3"})
@Modulithic(additionalPackages = {"com.example.demo2","com.example.demo3"},useFullyQualifiedModuleNames=true)
@SpringBootApplication
public class Application1Application {

	public static void main(String[] args) {
		SpringApplication.run(Application1Application.class, args);
//		ServiceMain man = new ServiceMain();
//		man.testApp2();
		
		 
	}
	@Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {
            System.out.println("Beans registered in context:");
            for (String beanName : ctx.getBeanDefinitionNames()) {
                System.out.println(" -> " + beanName);
            }
        };
    }

}
