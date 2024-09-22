package com.deloitte.lab9.ex2;


import java.util.Scanner;

public class App {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter string without space: ");
		
		String str = scan.next();
		
		
		InsertSpace is = (abc) -> {
			
				StringBuffer sb = new StringBuffer();
				
				for(int i=0;i<abc.length();i++) {
					
					sb.append(abc.charAt(i)+" ");
				}
				
				String res = sb.toString();
				
				return res;
			};
			
			System.out.println("New string is: "+is.insertBetweenString(str));
	}
}