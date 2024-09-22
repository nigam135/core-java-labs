
//Exercise 1: Create a method which accepts a hash map and return the values of the map in sorted order as a List.

package com.deloitte.lab6.ex1;

import java.util.ArrayList;

import java.util.HashMap;

import java.util.List;

import java.util.Map;

import java.util.Scanner;

import java.util.stream.Collectors;

public class App {
	
	public static void main(String[] args) {
	
		HashMap<Integer, Integer> numberMap = getUserInput();


		List<Integer> sortedValues = getValues(numberMap);
		
		sortedValues.forEach(System.out::println); 

	}


	public static HashMap<Integer, Integer> getUserInput() {
		
		Scanner scanner = new Scanner(System.in);
		
		HashMap<Integer, Integer> map = new HashMap<>();
		
		System.out.println("Enter the number of entries you want to add to the map:");

		int entries = scanner.nextInt(); 

		for (int i = 1; i <= entries; i++) {
			
			System.out.print("Enter key " + i + ": ");
			int key = scanner.nextInt();
			
			System.out.print("Enter value for key " + key + ": ");
			
			int value = scanner.nextInt();
			
			map.put(key, value);
			
		}

		return map;
	}

	public static List<Integer> getValues(Map<Integer, Integer> hm) {
		
		return new ArrayList<>(hm.values()).stream().sorted() 
				
				.collect(Collectors.toList()); 
	}
}
