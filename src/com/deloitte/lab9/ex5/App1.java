package com.deloitte.lab9.ex5;


import java.util.*;

public class App1 {
	public static int calcFact(int num) {
		int result = 1;
		for(int i=1;i<=num;i++) {
			result*=i;
		}
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter a number: ");
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		App obj=App1::calcFact;
		int res = obj.calcFactorial(n);
		System.out.println("The factorial of "+ n + " is "+res);
	

	}

}