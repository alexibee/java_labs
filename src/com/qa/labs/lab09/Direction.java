package com.qa.labs.lab09;

public class Direction {
	private double radians;

	
	public Direction(String name) {
		if(name.equalsIgnoreCase("east") || name.equalsIgnoreCase("e")) {
			this.radians = Math.toRadians(90);
		} else if (name.equalsIgnoreCase("west") || name.equalsIgnoreCase("w")) {
			this.radians = Math.toRadians(270);
		}else if (name.equalsIgnoreCase("south") || name.equalsIgnoreCase("s")) {
			this.radians = Math.toRadians(180);
		}else if (name.equalsIgnoreCase("north") || name.equalsIgnoreCase("n")) {
			this.radians = Math.toRadians(0);
		}
	}
	public Direction(double angle) {
		this.radians = Math.toRadians(angle);
	}
	
	public double getDirectionX() {
		return Math.cos(radians);
	}
	public double getDirectionY() {
		return Math.sin(radians);
	}
	public void setAngle(double angle) {
		this.radians = Math.toRadians(angle);
	}
	
}
