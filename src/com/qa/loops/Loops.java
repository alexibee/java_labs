package com.qa.loops;

public class Loops {

	public static void main(String[] args) {
		
		// Create an array with values
		int[] ages = {25, 29, 30, 35, 40};
		
		int[] numbers = new int[5]; // [0, 0, 0, 0, 0] (default value for int is 0)
		
		boolean flag = false;
		
		while (flag == true) {
			System.out.println("Don't see this :(");
		}
		
		do {
			System.out.println("We see this at LEAST once");
		} while (flag);
		
//		int i = 0;
//		while (i < 10) {
//			System.out.printf("%d squared = %d\n", i, i*i);
//			i++; // increase i by 1 each loop
//		}
		
		// initial val; condition; updater
		for (int i = 9; i >= 0; i--) {
			System.out.printf("%d squared = %d\n", i, i*i);
		}
		
		String[] names = {"Anoush", "Nandan", "Alexandra"};
		
		// this loops uses [i] to target the underlying data directly, and can therefore modify it
		for (int i = 0; i < names.length; i++) {
			names[i] += "x";
		}
		
		// this loop gets us copies of the values, but doesn't allow us to alter the underlying data
		for (String name : names) {
			name += "x";
		}
		
		System.out.println(names[0]);
		System.out.println(names[1]);
		System.out.println(names[2]);
	}
}
