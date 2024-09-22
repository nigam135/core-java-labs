//Exercise 4: Write a Java program that prompts the user for an integer and 
//then prints out all the prime numbers up to that Integer?




package com.deloitte.lab1.ex4;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		
		System.out.println("Enter an integer");
		
		Scanner sc =new Scanner(System.in);
		
		int num=sc.nextInt();
		
		System.out.println("Entered integer");
		
		 int sum=0;
		 
		 for (int i = 2; i <= num; i++) {
	           boolean isPrime = true;
	           
	        for (int j = 2; j * j <= i; j++) {
	              if (i % j == 0) {
	                    isPrime = false;
	                    break;
	                }
	            }
	            
	        	if (isPrime) {
	                sum += i;
	            }
	        }
	        System.out.println("Sum of prime numbers till " + num + ": " + sum);
	    }

		

	}


