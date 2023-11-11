package com.qa.labs.lab06;

import java.util.Scanner;

public class Lab6 {

	public void part1(Scanner scanner) {
		grades(scanner);
	}
	
	public void grades(Scanner scanner) {
		
		String[] names = new String[5];
		int[] marks = new int[5];
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Please enter a name");
			names[i] = scanner.nextLine();
			
			System.out.println("Please enter a mark (1-100)");
			marks[i] = scanner.nextInt();
			
			scanner.nextLine(); // clear scanner
		}
		
		for (int i = 0; i < names.length; i++) {
			String name = names[i];
			int examMark = marks[i];
			String result = null;
			
			if (examMark < 1 || examMark > 100) {
				result = "Error: marks must be between 1..100";
			} else if (examMark < 50) {
				result = "Fail";
			} else if (examMark >= 50 && examMark <= 60) {
				result = "Pass";
			} else if (examMark >= 61 && examMark <= 70) {
				result = "Merit";
			} else if (examMark >= 71 && examMark <= 100) {
				result = "Distinction";
			}
			
			System.out.printf("%s got %d marks and their result is: %s\n", name, examMark, result);
		}
	}
	
	public void account(double initial, double target, double interest) {
		double current = initial;
		int years = 0;
		
		while (current <= target) {
			current += (current * interest);
			years++;
		}
		
		System.out.printf("It would take %d years to go from £%.2f to £%.2f at an interest rate of %.2f%%", years, initial, target, interest);
	}
}
