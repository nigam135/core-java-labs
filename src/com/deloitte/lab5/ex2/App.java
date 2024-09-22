//Exercise 2: Write a Java Program to validate the full name of an employee. Create and throw a user defined exception if firstName and lastName is blank.

package com.deloitte.lab5.ex2;

import java.util.Scanner;

class NameValidationException extends Exception {

	public NameValidationException(String message) {

		super(message);
	}
}

public class App {

	static void validateName(String firstName, String lastName) throws NameValidationException {

		if (firstName == null || firstName.trim().isEmpty() || lastName == null || lastName.trim().isEmpty()) {

			throw new NameValidationException("First name and last name cannot be blank.");
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your first name:");

		String firstName = sc.nextLine();

		System.out.println("Enter your last name:");

		String lastName = sc.nextLine();

		try {

			validateName(firstName, lastName);

			System.out.println("Full name is valid: " + firstName + " " + lastName);

		} catch (NameValidationException e) {

			System.out.println("Error: " + e.getMessage());

		} finally {

			sc.close();
		}
	}
}
