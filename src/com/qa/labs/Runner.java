package com.qa.labs;

import java.util.Scanner;

public class Runner {
	
	public static void main(String[] args) {
		
		Lab04 lab4 = new Lab04();
		
		Scanner scanner = new Scanner(System.in);
		
		lab4.part1(scanner);
		
		scanner.close();
		
	}
}
