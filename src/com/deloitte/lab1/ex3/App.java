
//Exercise 3: The Fibonacci sequence is defined by the following rule.
//The first 2 values in the sequence are 1, 1. 
//Every subsequent value is the sum of the 2 values preceding it.
//Write a Java program that uses both recursive and non-recursive functions
//to print the nth value of the Fibonacci sequence?


package com.deloitte.lab1.ex3;

public class App {

	
	public static void main(String args[]) {
	     
        // printing first 10 numbers of Fibonacci series
        fibonacci(10);
        // using recursion
        int fib_len = 10;
        for (int i = 0; i < fib_len; i++) {
            System.out.print(fibRecursion(i) + " ");
          }
     
    }
	
	public static void fibonacci(int number){
        for(int i=0; i < number; i++){
            System.out.print(getFibonacci(i) + " ");
        }
    }
	public static int getFibonacci(int n){
	      
        if (n == 0) {
            return 0;
        }
        
        if (n == 1){
            return 1;
        }

        int first = 0;
        int second = 1;
        int nth = 1;

        for (int i = 2; i <= n; i++) {
            nth = first + second;
            first = second;
            second = nth;
        }
        return nth;
    }
	
	public static int fibRecursion(int count) {
	    if (count == 0) {
	      return 0;
	    }

	    if (count == 1 || count == 2) {
	      return 1;
	    } 
	    
	    return fibRecursion(count - 1) + fibRecursion(count - 2);
	  }

	
	

}
