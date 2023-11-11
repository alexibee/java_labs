package com.qa.basics;

public class Basics {
	
	// The main method is the starting (entry) point for execution of the program
	public static void main(String[] args) {
//		String firstName = "Anoush";
//		String surname = "Lowton";
//		int age = 30;
//		
//		System.out.println(firstName + " " + surname);
//		System.out.println("age is: " + age);
		
		int int1 = 4;
		long long1 = int1;    // implicit cast happens here because long >= int
		double double1 = int1; // implicit cast happens here because double >= long
		
//		double double2 = 4.5;
//		int int2 = double2; // implicit cast CAN'T happen here because int < double
//		
//		long long2 = 5;
//		int int3 = long2;// implicit cast CAN'T happen here because int < long
//		
		double double3 = 4.9;
		int int4 = (int) double3; // you can explicitly cast though, and it truncates to fit

		long long3 = 5;
		int int5 = (int) long3;// you can explicitly cast though, and it truncates to fit
		
	}
	
}
