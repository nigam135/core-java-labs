package com.deloitte.lab.ex8;

import java.util.Scanner;

public class App {
	
	public static boolean isPowerOfTwo(int n) {
        if (n <= 0) {
        	
            return false;
        }
        while (n % 2 == 0) {
        	
            n /= 2;
        }
        return n == 1;
    }

    public static void main(String[] args) {
    	
    	Scanner sc=new Scanner (System.in);
	 	
	 	System.out.println("Enter number");
	 	
	 	int num=sc.nextInt();
        
	 	int n = num; 
    	
        System.out.println(isPowerOfTwo(n)); 
        
    }

}
