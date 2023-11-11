package com.qa.labs.lab18;

public class Car {
	protected String model;
	protected int speed;
	
	public Car(String model, int speed) {
		this.model = model;
		this.speed = speed;
	}
	
	public void accelerate(int seconds) {
		speed += 5*seconds;
	}
	
	public void getToSixty() {
		speed = 60;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
}
