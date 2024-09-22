

//Exercise 2: Create a class containing a method to create the mirror image of a String. The method should return the two Strings separated with a pipe(|) symbol .


package com.deloitte.lab3.ex2;

import java.util.Scanner;

public class App {
	
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);
        
   
        System.out.print("Please enter a phrase: ");
        
        String inputPhrase = scanner.nextLine(); 

      
        String mirroredOutput = generateMirroredString(inputPhrase);
        

        System.out.println("Mirrored String: " + mirroredOutput);
        
        scanner.close(); 
    }


    public static String generateMirroredString(String phrase) {
    	
        String original = phrase;
        

        StringBuilder reversedPhrase = new StringBuilder(original).reverse();
        

        return original + " | " + reversedPhrase;
        
    }
}
