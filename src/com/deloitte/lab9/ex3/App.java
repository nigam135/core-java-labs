package com.deloitte.lab9.ex3;

import java.util.Scanner;

public class App {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter username: ");
		
		String userName = scan.nextLine();
		
		System.out.println("Enter Password: ");
		
		String password = scan.nextLine();
		
		
		Accept ac =(user, pass) -> {
			
				boolean status = false;
				
				if(user.equals("") || pass.equals("")) {
					
					status = false;
					
				}
				else {
					
					status = true;
				}
				
				return status;
		};
		
		boolean res = ac.accept(userName, password);
		
		if(res==true) {
			
			System.out.println("Username and password are valid");
		}
		else {
			System.out.println("Username and password are not valid");
		}
	}
}