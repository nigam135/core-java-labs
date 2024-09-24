package com.deloitte.lab4.ex2;


public class Book extends WrittenItem{

	public Book(int identificationNumber, String title, int numberOfCopies) {
		super(identificationNumber, title, numberOfCopies);
	}
	
    
	
	@Override
	public void addDetails() {
		super.addDetails();	
	}

	@Override
	public void printDetails() {
		super.printDetails();
		
	}

     
}