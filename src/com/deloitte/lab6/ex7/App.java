

// Exercise 7: Create a method which accepts an integer array, reverse the numbers in the array and returns the resulting array in sorted order


package com.deloitte.lab6.ex7;

import java.util.Arrays;
import java.util.Collections;

public class App {
	public static Integer[] getsorted(int[] arr) {

		Integer[] result = new Integer[arr.length];

		for (int i = 0; i < arr.length; i++) {
			String reversedString = new StringBuilder(String.valueOf(arr[i])).reverse().toString();
			result[i] = Integer.parseInt(reversedString);
		}

		return result;
	}

	public static void main(String[] args) {
		int[] inputArray = { 123, 456, 789 };
		Integer[] outputArray = getsorted(inputArray);

		System.out.println(Arrays.toString(outputArray));
	}
}
