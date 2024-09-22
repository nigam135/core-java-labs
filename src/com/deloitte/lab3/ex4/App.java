
//Exercise 4: Create a method that accepts a number and modifies it such that the each of the digit in the newly formed number is equal to the difference between two consecutive digits in the original number. The digit in the units place can be left as it is. 
//Note: Take the absolute value of the difference. Ex: 6-8 = 2


package com.deloitte.lab3.ex4;

import java.util.Scanner;

public class App {
	
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Please enter a sequence of digits: "); 
        
        int inputNumber = sc.nextInt();
        
        
        int transformedNumber = transformNumber(inputNumber);
        
        System.out.println("Transformed sequence: " + transformedNumber);
        
        
        sc.close(); 
        
    }
    
    public static int transformNumber(int num) {
    	
        String numString = String.valueOf(num);
        
        StringBuilder result = new StringBuilder();


        
        for (int i = 0; i < numString.length() - 1; i++) {
        	
            int firstDigit = Character.getNumericValue(numString.charAt(i));
            
            int secondDigit = Character.getNumericValue(numString.charAt(i + 1));
            
            
            
            result.append(Math.abs(firstDigit - secondDigit));
        }
        
      
        result.append(numString.charAt(numString.length() - 1));
        

        return Integer.parseInt(result.toString());
    }
}
