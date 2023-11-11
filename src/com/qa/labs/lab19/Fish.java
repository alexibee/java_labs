package com.qa.labs.lab19;

public class Fish extends Animal implements Consumable, Insurable {

	@Override
	public String getPremium() {
		return "It is not a premium fish son, what do you think it is, a Harrods?";
	}

	@Override
	public String expires() {
		return "Expires: yesterday. And that's you being lucky actually.";
	}
	
	@Override
	public String describeTaste() {
		return "Fish: Juicy";
	}
	
	@Override
	public String isMainCourseDish() {
		return "Fish: " + true;
	}


}
