package com.qa.labs.lab18;

public class RacingCar extends Car {
	String driver;
	int turboFactor;
	
	public RacingCar(String model, int speed, String driver, int turboFactor) {
		super(model,speed);
		this.driver = driver;
		this.turboFactor = turboFactor;
	}
	
	@Override
	public void accelerate(int seconds) {
		super.accelerate(seconds);
		speed = speed*turboFactor;
	}

	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public int getTurboFactor() {
		return turboFactor;
	}

	public void setTurboFactor(int turboFactor) {
		this.turboFactor = turboFactor;
	}
	
}
