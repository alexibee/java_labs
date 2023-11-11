package com.qa.labs.lab19;

public abstract class Bird extends Animal {
	private String name;
	AnimalType Bird;
	
	
	public String getName() {
		return this.name;
	};
	
	public Bird(String name) {
		this.name = name;
	}
}