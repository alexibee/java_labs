package com.qa.labs.lab05;

import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Lab05 lab5 = new Lab05();
		
		lab5.grades(scanner);
		
		scanner.nextLine(); // clear scanner
		
		lab5.part2(scanner);
		
		scanner.close();
		
	}
}
