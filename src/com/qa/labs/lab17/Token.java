package com.qa.labs.lab17;

public class Token {
	private int x;
	private int y;
	private Map map;
	
	final private int maxSpeed = 65;
	
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public Token(int x, int y, Map map) {
		this.x = x;
		this.y = y;
		this.map = map;
	}
	
	public boolean move(Direction direction, int distance) {
		
		if (distance > maxSpeed) {
			System.out.println("Moving too fast, this movement is cancelled. Please check data");
			distance = 0;
		}
		
		double movementX = direction.getDirectionX() * distance;
		double movementY = direction.getDirectionY() * distance;
		
		if(map.getXSize()/2 >= Math.abs(x + movementX) && map.getYSize()/2 >= Math.abs(y + movementY)) {
			x += movementX;
			y += movementY;
			return true;
		}
		System.out.println("The token has fallen off the map");
		return false;
	}
}
