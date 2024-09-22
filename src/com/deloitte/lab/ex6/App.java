package com.deloitte.lab.ex6;
import java.util.Scanner;

public class App {
	
	public static int calculatedifference(int n){
		
	      //sum of squares of n natural numbers
		
	      int calculatesum = (n * (n + 1) * (2 * n + 1)) / 6;
	      
	      //sum of n natural numbers
	      
	      int sumN = (n * (n + 1)) / 2;
	      
	      //square of sum of n natural numbers
	      
	      int squareSumN = sumN * sumN;
	      
	      //difference
	      
	      return Math.abs(calculatesum - squareSumN);
	   }
	
	   public static void main(String args[]){
		   
		   Scanner sc=new Scanner (System.in);
		 	
		 	System.out.println("Enter number");
		 	
		 	int num=sc.nextInt();
	        
		 	int n = num; 
		  
	      
	      System.out.println("Number: " + n);
	      
	      System.out.println("Difference: " + calculatedifference(n));
	   }

}
