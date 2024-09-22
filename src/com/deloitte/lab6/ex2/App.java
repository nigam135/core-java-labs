package com.deloitte.lab6.ex2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class App { 
	
	public static void main(String[] args) {
		try {
			int lines = 0, chars = 0, words = 0;

			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("Enter text (type 'exit' on a new line to finish):");

			String line;
			
			while (!(line = reader.readLine()).equalsIgnoreCase("exit")) {

				lines++;

				chars += line.length();
				
				
				String[] wordArray = line.trim().split("\\s+");
				
				words += wordArray.length > 0 && !wordArray[0].isEmpty() ? wordArray.length : 0;
			}

			reader.close();
			

			System.out.println("No. of characters = " + chars);
			
			System.out.println("No. of words = " + words);
			
			System.out.println("No. of lines = " + lines);

			
		} catch (IOException e) {
			
			System.out.println("An error occurred while reading input.");
		}
	}
}
