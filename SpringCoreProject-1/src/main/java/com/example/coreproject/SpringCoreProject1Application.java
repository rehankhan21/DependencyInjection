package com.example.coreproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringCoreProject1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext Context = SpringApplication.run(SpringCoreProject1Application.class, args);
		
		System.out.println("my project is running");
		
		Cat cat1 = Context.getBean(Cat.class);
		
		cat1.setColor("gold");
		cat1.setEats("Everything");
		cat1.setGender('M');
		cat1.setName("Lion");
		cat1.setNoise("ROARR");
		cat1.setNoOfLegs(4);
		cat1.display();
	}

}
