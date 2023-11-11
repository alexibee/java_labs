package com.qa.labs.lab19;

public class Duck extends Bird implements Insurable {
	
	public Duck(String name) {
		super(name);
	}

	@Override
	public String getPremium() {
		return "It is a premium " + super.getName();
	}

	@Override
	public String expires() {
		return "Expires: 20.11.2023";
	}

}
