package com.deloitte.lab3.ex1;
import java.util.Scanner;
import java.util.StringTokenizer;

public class App {

	public static void main(String[]args) {
		
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		
		
		StringTokenizer sb =new StringTokenizer(str);
		
		int sum=0;
		
		while(sb.hasMoreTokens()) {
			String token =sb.nextToken();
			
		int	j=Integer.parseInt(token);
		
		sum=sum+j;
		}
		
		System.out.println(sum);
		
		
		
	}
}
