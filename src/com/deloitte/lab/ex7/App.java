package com.deloitte.lab.ex7;


import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number: ");
		int num = scan.nextInt();
		
		if(App.checkNumber(num)) {
			System.out.println("Number is in increasing order");
		}
		else {
			System.out.println("Number is not in increasing order");
		}
		
		scan.close();
	}
	
	public static boolean checkNumber(int num) {
		int digit1;
		int digit2;
		
		boolean value = false;
		while(num!=0) {
			digit1 = num%10;
			num=num/10;
			digit2=num%10;
			num=num/10;
			
			if(digit1>=digit2) {
				value = true;
			}
			else {
				value = false;
				break;
			}
		}
		
		return value;
	}

}