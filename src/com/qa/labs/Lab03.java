package com.qa.labs;

import java.util.Scanner;

public class Lab03 {
	
    public static void main(String[] args){
    	Scanner scanner = new Scanner(System.in);
    	
        int intResult = getInt("Please enter a number: ", scanner);
        
        // Clear the scanner
        scanner.nextLine();
        
        String strResult = getString("Please enter a string: ", scanner);

        System.out.println("Number is: " + intResult);
        System.out.println("String is: " + strResult);
        
        // part 2
        TheLunchQueue(scanner);
        
        scanner.close();
    }

    public static int getInt(String prompt, Scanner scanner){
        System.out.println(prompt);
        int result = scanner.nextInt();
        return result; 
    }
    
    public static String getString(String prompt, Scanner scanner){
        System.out.println(prompt);
        String result = scanner.nextLine();
        return result;
    }
    
    // Part 2
    public static void TheLunchQueue(Scanner scanner) {
    	String mainCourse = getString("What main dish would you like(Fish, Burgers or veg) ?", scanner);
    	int potatoes = getInt("How many roast potatoes would you like?", scanner);
    	int sprouts = getInt("How many brussel sprouts would you like?", scanner);
    	
    	System.out.println("Your lunch is " + mainCourse + " with " + potatoes + " Potatoes and " + sprouts + " brussel sprouts");
    }
}
