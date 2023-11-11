package com.qa.methods;

public class Runner {

	// Entry point for execution of the program
	public static void main(String[] args) {
		Printer printer = new Printer(); // Constructor to make object
		printer.printSomething();
		printer.printSomethingCustom("This is a custom message");
		
		Calculator calc = new Calculator(); // Constructor to make object
		int result = calc.add(5, 10);	
		System.out.println("The result is: " + result);
		
		// create an Object
		Tax taxObj = new Tax(); // Constructor to make object
		Double taxAmount = taxObj.getTax(50000.00, 0.2);
		System.out.println(taxAmount);
	}
}
