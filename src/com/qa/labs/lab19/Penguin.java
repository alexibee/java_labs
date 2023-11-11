package com.qa.labs.lab19;

public class Penguin extends Bird {
	
	public Penguin(String name) {
		super(name);
	}

	@Override
	public String describeTaste() {
		return "You are not to eat a " + super.getName() + " pal";
	}

	@Override
	public String isMainCourseDish() {
		return super.getName() + " is not a dish";
	}
}
