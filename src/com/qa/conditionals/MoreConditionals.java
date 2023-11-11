package com.qa.conditionals;

public class MoreConditionals {

	public static void main(String[] args) {
		String name = "Anoush";
		
		boolean result = name.endsWith("ed"); // does name end with "ed"? True/false
		
		if (result == false) {
			System.out.println("Name doesn't end with 'ed' ");
		}
		
//		if (!result) {
//			System.out.println("Name doesn't end with 'ed' ");
//		}
		
		int x = 9, y = 4;
		
		System.out.println( x > y + 4);
		System.out.println( x > y++ * 2);
		System.out.println( x * y <= 36);
		System.out.println( x / y == 1);
		System.out.println( x % y);
		System.out.println( (x > y)? "Worm" : "Words");
		
	}
	
}
