package com.qa.array;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraysDemo {

	public static void main(String[] args) {
	
		int[] numbers = {5, 3, 6, 7, 1};
		
		Arrays.sort(numbers);
		
//		System.out.println(numbers[2]);
		
//		for (int num : numbers) {
//			System.out.println(num);
//		}
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
		System.out.printf("The first number is %d. The second number is %d.", numbers[0], numbers[1]);
		
		ArrayList<Integer> numbers2 = new ArrayList<>();
		numbers2.add(5);
		numbers2.add(10);
		numbers2.add(15);
		numbers2.add(25);
		numbers2.add(50);
		
		for (int num : numbers2) {
			System.out.println(num);
		}
		
		for (int i = 0; i < numbers2.size(); i++) {
			System.out.println(numbers2.get(i));
		}
		
	}
}
