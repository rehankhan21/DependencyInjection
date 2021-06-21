package com.example.coreproject;

import org.springframework.stereotype.Component;

@Component
public class Noise {
	private String noise;

public String getNoise() {
	return noise;
}

public void setNoise(String noise) {
	this.noise = noise;
}

public void display() {
	System.out.println("Animal goes: " + this.noise);
}

	
}
