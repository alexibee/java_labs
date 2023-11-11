package com.qa.labs.lab07;

public class Lab7 {

	public void sort(int[] inputArray) {
		int len = inputArray.length;
		
		for (int i = 0; i < len - 1; i++) {
			for (int j = 0; j < len - i - 1; j++) {
				if (inputArray[j] > inputArray[j + 1]) {
					int temp = inputArray[j];
					inputArray[j] = inputArray[j + 1];
					inputArray[j + 1] = temp;
				}
			}
		}
	}
}
