package com.deloitte.lab9.ex1;

import java.util.Scanner;

public class App {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter x: ");
		
		double x= scan.nextInt();
		
		System.out.println("Enter y: ");
		
		double y = scan.nextInt();
		
		Calculate result = (a,b) -> Math.pow(x, y);
		
		
		System.out.println("Result is: "+result.calPower(x, y));
	}
}