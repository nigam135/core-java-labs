//Exercise 5: Create a method which accepts an array of integer elements and return the second smallest element in the array

package com.deloitte.lab6.ex5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class App {

	App() {
	}

	static int[] getvalues(int size, int[] arry) {

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < size; i++) {
			arry[i] = sc.nextInt();
		}

		return arry;
	}

	static int getSecondSmallest(int[] arry) {
		if (arry.length < 2) {
			throw new IllegalArgumentException("Array must contain at least two elements.");
		}

		ArrayList<Integer> list = new ArrayList<>();
		for (int num : arry) {
			list.add(num);
		}

		list = new ArrayList<>(new HashSet<>(list));// this is required for removing duplicates from the array list

		Collections.sort(list);

		return list.get(1);
	}

	public static void main(String[] args) {

		System.out.println("enter the size of array");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();

		int[] arry = new int[size];

		getvalues(size, arry);
		getSecondSmallest(arry);

		App obj1 = new App();

		try {

			int secondSmallest = getSecondSmallest(arry);
			System.out.println("The second smallest element is: " + secondSmallest);
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}
}
