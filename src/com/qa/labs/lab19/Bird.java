package com.qa.labs.lab19;

public abstract class Bird extends Animal implements Consumable {
	private String name;
	AnimalType Bird;
	
	
	public String getName() {
		return this.name;
	};
	
	public Bird(String name) {
		this.name = name;
	}
	
	@Override
	public String describeTaste() {
		return getName() + ": " + "Delicate";
	}
	
	@Override
	public String isMainCourseDish() {
		return getName() + ": " + true;
	}

}