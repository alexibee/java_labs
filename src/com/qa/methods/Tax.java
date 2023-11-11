package com.qa.methods;

public class Tax {

	public double getTax(double salary) {
		return salary * 0.25;
	}

	public double getTax(double salary, double rate) {
		return salary * rate;
	}

}
