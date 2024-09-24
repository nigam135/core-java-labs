package com.deloitte.lab4.ex2;

import java.util.*;

public class App {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Enter the list of items available in the library");
		System.out.println("1. Book");
		System.out.println("2. JournalPaper");
		System.out.println("3. Video");
		System.out.println("4. CD");
		for (;;) {


			System.out.println("Enter your choice");
			int choice = scan.nextInt();

			switch (choice) {
			/**
			 * If the user's choice is 1 then the methods which are in accordance with book are invoked
			 */

			case 1:
				System.out.println("Your choice is book");
				Book bookObj = new Book(0, null, 0);
				bookObj.addDetails();
				bookObj.printDetails();
				break;
			/**
			 * If the user's choice is 2 then the methods which are in accordance with journal papers are invoked.
			 */

			case 2:
				System.out.println("Your choice is journal paper");
				JournalPaper journalObj = new JournalPaper(0, null, 0);
				journalObj.addDetails();
				journalObj.printDetails();
				break;

			/**
			 * If the user's choice is 3 then the methods which are in accordance with cd are invoked.
			 */

			case 3:
				System.out.println("Your choice is CD");
				CD cdObj = new CD(0, null, 0);
				cdObj.addDetails();
				cdObj.printDetails();
				break;

			/**
			 * If the user's choice is 4 then the methods which are in accordance with video are invoked
			 */

			case 4:
				System.out.println("Your choice is Video");
				Video videoObj = new Video(0, null, 0);
				videoObj.addDetails();
				videoObj.printDetails();
				break;

			/**
			 * If the user's choice is other than the above numbers then the methods which are in accordance with book are invoked. 
			 * This default case asks the user whether the user likes to continue or not.
			 */

			default:
				System.out.println("Do you want to continue[Y/N or y/n]");
				char ch = scan.next().charAt(0);
				if (ch == 'Y' || ch == 'y') {
					break;
				} else {
					System.exit(0);
				}
			}
		}

	}

}
