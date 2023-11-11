package com.qa.labs.lab17;

public class Program {
	
	public static void main(String [] args) {
		Map map = new Map(500,400);
		Token t1 = new Token(70, 30, map);
		Plane p1 = new Plane(60,40,map);
		if(t1.move(new Direction(120), 50) == false) t1 = null;
		if(p1.move(new Direction(45), 30) == false) p1 = null;
		p1.climb(20);
		System.out.println(t1.getX());
		System.out.println(t1.getY());
		System.out.println(p1.getX());
		System.out.println(p1.getY());
		System.out.println(p1.getHeight());
		if(t1.move(new Direction(50), 20) == false) t1 = null;
	}
}
