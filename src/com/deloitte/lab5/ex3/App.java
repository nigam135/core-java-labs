//Exercise 3:  Create an Exception class named as “EmployeeException”(User defined Exception) in a package named as “com.cg.eis.exception” and throw an exception if salary of an employee is below than 3000. Use Exception Handling mechanism to handle exception properly.


package com.deloitte.lab5.ex3;

import java.util.Scanner;

public class App {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter salary of an employee: ");
		
		double salary = scan.nextDouble();
		
		
		try {
			
			if(salary<3000.0) {
				
				throw new EmployeeException();
			}
			else {
				
				System.out.println("Salary of an employee: "+salary);
			}
		}catch(EmployeeException e) {
			
			System.out.println(e.getMessage());
		}
	}
}

class EmployeeException extends Exception{
	
	public String getMessage() {
		
		return "Salary of employee is less than 3000";
	}
}