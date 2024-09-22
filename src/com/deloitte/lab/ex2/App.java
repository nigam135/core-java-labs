//Write a java program that simulates a traffic light. 
//The program lets the user select one of three lights: red, yellow, or green with int inputs.
//On entering the choice, an appropriate message with “stop” or “ready” or “go” should appear in the console. 




package com.deloitte.lab.ex2;

import java.util.Scanner;




public class App {
	
	public static void main(String args[]) {
		
		
		int red=1;
		int yellow=2;
		int green=3;
		System.out.println("Select one of the three lights");
		Scanner sc= new Scanner(System.in);
		int signal=sc.nextInt();


		System.out.println("Entered traffic signal : " + signal );
		
		switch (signal) 
		{
        case 1:  System.out.println("Stop");
                 break;
                 
        case 2: System.out.println("Ready"); 
                 break;
                 
        case 3:  System.out.println("Go"); 
        	      break;
        	      
       default:  System.out.println("no choice"); 
		
	}
	}
}

