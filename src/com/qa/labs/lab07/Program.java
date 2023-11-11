package com.qa.labs.lab07;

public class Program {

	public static void main(String[] args) {
		
		Lab7 lab7 = new Lab7();
		
		int[] myArray = {8, 5, 6, 9, 1};
		
		lab7.sort(myArray);
		
		for (int i : myArray) {
			System.out.println(i);
		}
	}
	
}
