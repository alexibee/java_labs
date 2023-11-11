package com.qa.labs.lab17;

public class Plane extends Token {
	
	final static int maxSpeed = 360;
	private int height;
	
	public Plane(int x, int y, Map map) {
		super(x, y, map);
	}
	
	public int getHeight() {
		return height;
	}
	
	public void climb(int howHigh) {
		height += howHigh;
	}
	
	public void land() {
		height = 0;
	}
}
