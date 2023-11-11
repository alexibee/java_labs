package com.qa.labs.lab05;

import java.util.Scanner;

public class Lab05 {

	public int getInt(String prompt, Scanner scanner){
        System.out.println(prompt);
        int result = scanner.nextInt();
        return result; 
    }
	
	public static String getString(String prompt, Scanner scanner){
	    System.out.println(prompt);
	    String result = scanner.nextLine();
	    return result;
	}
	
	public void grades(Scanner scanner) {
		
		int examMark = getInt("Please enter an exam mark (1-100)", scanner);
		
		if (examMark < 1 || examMark > 100) {
			System.out.println("Error: marks must be between 1..100");
		} else if (examMark < 50) {
			System.out.println("Fail");
		}else if (examMark >= 50 && examMark <= 60) {
			System.out.println("Pass");
		}else if (examMark >= 61 && examMark <= 70) {
			System.out.println("Merit");
		}else if (examMark >= 71 && examMark <= 100) {
			System.out.println("Distinction");
		}
	}
	
	public void part2(Scanner scanner) {
		
		boolean summerTime = getString("Is it summer time?", scanner).equals("yes");
		
		boolean earlyEvening = getString("Is it early evening?", scanner).equals("yes");
		
		if (summerTime) {
			System.out.println("Take a shower");
			System.out.println("Do outdoors hobby");
			System.out.println("Contact friends");
			
			if (earlyEvening) {
				System.out.println("Eat outside");
			} else {
				System.out.println("Eat inside");
			}
		} else {
			System.out.println("Take a shower");
			System.out.println("Eat inside");
			System.out.println("Contact friends");
			
			if (earlyEvening) {
				System.out.println("Take a walk");
			}
		}
	}
}
