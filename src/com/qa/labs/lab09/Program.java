package com.qa.labs.lab09;

public class Program {
	
	public static void main(String [] args) {
		Map map = new Map(500,400);
		Token t1 = new Token(70, 30, map);
		if(t1.move(new Direction(120), 50) == false) t1 = null;
		System.out.println(t1.getX());
		System.out.println(t1.getY());
		if(t1.move(new Direction(50), 20) == false) t1 = null;

	}
}
