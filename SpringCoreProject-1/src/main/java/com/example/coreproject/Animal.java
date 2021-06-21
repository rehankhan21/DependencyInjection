package com.example.coreproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Animal {

	private String name;						
	private String eats;
	private int noOfLegs;

	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getEats() {
		return eats;
	}



	public void setEats(String eats) {
		this.eats = eats;
	}



	public int getNoOfLegs() {
		return noOfLegs;
	}



	public void setNoOfLegs(int noOfLegs) {
		this.noOfLegs = noOfLegs;
	}




	public void display() {
		System.out.println("----------------");
		System.out.println("Animals");
		System.out.println("----------------");
		System.out.println("This animal is a: " + this.name);
		System.out.println("Eats: " + this.eats);
		System.out.println("noOfLegs: " + this.noOfLegs);
	}
	
}
