//Exercise 1: Create a method which accepts an array of integer elements and return the second smallest element in the array



package com.deloitte.lab2.ex1;

import java.util.Scanner;

public class App {
	
	
	static int calcsecondlarg(Integer[] arry, int size) {
		
		
		
		for(int i=0;i<size;i++) {
			
			if(i==size-1) {
				break;
			}
			if(arry[i+1] <arry[i]) {
				arry[i+1]=arry[i];
			}
			
			
		}
		return arry[size-1];
		
		
	}
	
	public static void main(String args[]) {
		
		int size;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the size of the array");
		
		size=sc.nextInt();
		
		Integer[] arry= new Integer[size];
		
			
		System.out.println("Enrter the integers");
		
		for(int i=0;i<size;i++) {
			
			arry[i]=sc.nextInt();
		}
		
		
		System.out.println("strings");
		
		
		for(int i=0;i<size;i++) {
			System.out.println(arry[i]);
		}
		
		
		sc.close();
		
		
		
		
		int secondLargest = calcsecondlarg(arry, size);
		System.out.println(secondLargest);

	}

}
