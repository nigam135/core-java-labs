package com.deloitte.lab3.ex8;


import java.util.Scanner;

public class App {
	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter string: ");
		
		String str = scan.next();
		
		if(App.checkString(str)) {
			
			System.out.println("String is positive");
		}
		else {
			System.out.println("String is not positive");
		}
	}
	
	public static boolean checkString(String str) {
		
		boolean status = false;
		
		
		for(int i=0;i<str.length()-1;i++) {
			
			if((int)str.charAt(i) < (int)str.charAt(i+1)) {
				
				status = true;
			}
			else {
				status = false;
				
				break;
			}
		}
		
		return status;
	}
}