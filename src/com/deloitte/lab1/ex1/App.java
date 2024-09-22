

//Exercise 1: Create a method to find the sum of the cubes of the digits of an n digit number

package com.deloitte.lab1.ex1;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		
		System.out.println("enter the digit");
		
		Integer[] arry= {};
		Integer number=sc.nextInt();
		
		System.out.println("Entered number" + number);
		int sum=0;
        while (number != 0) {
            int digit = number % 10;
            sum += digit * digit * digit;
            number /= 10;
        }

        System.out.println("Sum of cubes of digits: " + sum);

		

	}

}
