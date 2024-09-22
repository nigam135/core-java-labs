package com.deloitte.lab.ex5;
import java.util.Scanner;


public class App {
	 public static void main(String[] args) {
		 	Scanner sc=new Scanner (System.in);
		 	
		 	System.out.println("Enter number");
		 	
		 	int num=sc.nextInt();
	        
		 	int n = num; 
	        
	        int sum = CalculateSum(n);
	        
	        System.out.println("The sum of the first " + n + " natural numbers divisible by 3 or 5 is: " + sum);
	    }
	 
	 	public static int CalculateSum(int n) {
	    
	 		int count = 0;
	        
	 		int sum = 0;
	        
	 		int currentNumber = 1;

	        while (count < n) {
	        
	        	if (currentNumber % 3 == 0 || currentNumber % 5 == 0) {
	            
	        		sum += currentNumber;
	                
	        		count++;
	            }
	            
	        	currentNumber++;
	        }
	        
	        return sum;
	    }

}
