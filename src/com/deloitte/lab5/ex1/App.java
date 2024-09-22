
//Exercise 1:  Validate the age of a person and display proper message by using user defined exception. Age of a person should be above 15.


package com.deloitte.lab5.ex1;

import java.util.Scanner;
import java.lang.Exception;



class invalidageexception extends Exception {
	
	
	public invalidageexception(String str) {
		super(str);
	}
	
}
public class App {
	
	
 public	static void validate(int age) {
		
		try {
			if(age>15) {
				throw new invalidageexception("is an exception");
			}
		}
		catch(invalidageexception e) {
			System.out.println(e.getMessage());
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter age");	
		
		int age;
			Scanner sc=new Scanner(System.in);
			age=sc.nextInt();
			
		validate(age);
			
			
			
		
		
	}

}
