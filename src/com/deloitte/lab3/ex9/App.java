package com.deloitte.lab3.ex9;

import java.time.LocalDate;

import java.time.Period;

public class App {
	
	public static void main(String[] args)
    {
        LocalDate pastDate = LocalDate.of(2024,11,10);
        
        LocalDate todayDate = LocalDate.now();
        
 
        Period diff = Period.between(pastDate, todayDate);
        
 
     System.out.printf("\nDifference is %d years, %d months and %d days old:", 
    		 
                    diff.getYears(), diff.getMonths(), diff.getDays());
  }
}