package com.qa.strings;

public class PrintFormat {

	public static void main(String[] args) {
		
		int num = 123456;
		
		System.out.printf("%8d\n", num);
		
		System.out.printf("%08d\n", num);
		
		System.out.printf("%+8d\n", num);
		
		System.out.printf("%,8d\n", num);
		
	}
	
}
