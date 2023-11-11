package com.qa.labs.lab17;

public class Submarine extends Token{
	final static int maxSpeed = 15;
	private int depth;
	
	public Submarine(int x, int y, Map map) {
		super(x, y, map);
	}
	
	public void dive(int howDeep) {
		depth += howDeep;
	}
	
	public void surface() {
		depth = 0;
	}
	public int getDepth() {
		return depth;
	}
}	
