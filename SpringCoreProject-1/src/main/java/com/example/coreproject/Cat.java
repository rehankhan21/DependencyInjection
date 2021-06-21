package com.example.coreproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component

public class Cat {

	private String color;
	private char gender;
	
	@Autowired
	private Animal animal;
	@Autowired
	private Noise noise;
	
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public void setNoise(String noi) {
		noise.setNoise(noi);
	}
	
	public void setName(String name) {
		animal.setName(name);
	}
	
	public void setEats(String eats) {
		animal.setEats(eats);
		
	}
	
	public void setNoOfLegs(int legs) {
		animal.setNoOfLegs(legs);
	}

//	public AnimalNoise getNoise() {
//		return noise;
//	}

//	public void setNoise(AnimalNoise noise) {
//		this.noise = noise;
//	}

//	public void noise(String noi) {
//		noise = new AnimalNoise();
//		noise.noise = noi;
//	}
	
	public void display() {
//		super.display();
		animal.display();
		noise.display();
		System.out.println("Color: " + this.color);
		System.out.println("Gender: " + this.gender);
//		System.out.println("Noise: " + this.noise.noise);
	}
}
