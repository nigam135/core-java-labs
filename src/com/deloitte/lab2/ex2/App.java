

//Exercise 2: Create a method that can accept an array of String objects and sort in alphabetical order. The elements in the left half should be completely in uppercase and the elements in the right half should be completely in lower case. Return the resulting array.
//Note: If there are odd number of String objects, then (n/2) +1 elements should be in UPPPERCASE

package com.deloitte.lab2.ex2;

import java.util.Arrays; 

import java.util.Scanner;

public class App {
	

	public static String[] sortmethod(String[] string) {

		Arrays.sort(string);
		
		return string;
	}
	
	
	public static void main(String[] args) {
		
		
		   System.out.println("Enetr the number of strings");
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		 
		  String string[] = new String[num];
		
		System.out.println("Enter the respective Strings: ");
		
		for(int i=0;i<num;i++) {
			
			string[i] = sc.next();
		}
		
		  System.out.println("Sorted strings are: ");
		
		for(String i : App.sortmethod(string)) {
			
			System.out.print(i+" ");
			
		}
		
		sc.close();
		
		
	}
	
}
