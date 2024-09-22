
package com.deloitte.lab6.ex6;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class App {                                                                //voting program
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
                                                                       // HashMap to store IDs and their corresponding Date of Birth
        Map<String, String> voterInfo = new HashMap<>();
        
                                                                        // Initialize input with 'Y' to start the loop
        char input = 'Y';

                                                                         // Loop until the user enters a key other than 'Y'
        while (input == 'Y' || input == 'y') {
                                                                       // Prompt the user to enter their ID
            System.out.print("Enter your ID: ");
            String id = scanner.nextLine();

                                                                       // Prompt the user to enter their Date of Birth
            System.out.print("Enter your Date of Birth (yyyy-MM-dd): ");
            String dobInput = scanner.nextLine();
            
                                                                           // Store ID and DOB in the HashMap
            voterInfo.put(id, dobInput);

                                                                               // Prompt the user to continue or exit
            System.out.print("To continue press Y (or y), to exit press any other key: ");
            input = scanner.next().charAt(0);
            scanner.nextLine();                                                // Consume the newline character
        }

                                                                                // Generate the list of eligible voters
        List<String> eligibleVoterIDs = votersList(voterInfo);

                                                                                  // Display all eligible voter IDs
        System.out.println("\nEligible Voter IDs:");
        for (String eligibleID : eligibleVoterIDs) {
            System.out.println(eligibleID);
        }

                                                                                     // Display a termination message when the loop exits
        System.out.println("Program Terminated");

                                                                                     // Close the Scanner to prevent resource leaks
        scanner.close();
    }
                                                                                 // Method to generate a list of eligible voters based on the ages
    public static List<String> votersList(Map<String, String> voterInfo) {
        List<String> eligibleVoterIDs = new ArrayList<>();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

                                                                             // Iterate through the keys of the voterInfo map
        for (String id : voterInfo.keySet()) {
            String dobInput = voterInfo.get(id);
            
            try {
                                                                           // Parse the date of birth
                Date dob = dateFormat.parse(dobInput);
                
                                                                           // Check if the person is eligible to vote based on age
                if (calculateAge(dob) >= 18) {
                    eligibleVoterIDs.add(id);                                // Add ID to the list if eligible
                }
            } catch (Exception e) {
                System.out.println("Invalid Date format for ID " + id + ". Please use yyyy-MM-dd.");
            }
        }
        
        return eligibleVoterIDs;                                         // Return the list of eligible voter IDs
    }

                                                                          // Method to calculate age based on Date of Birth
    private static int calculateAge(Date dob) {
        Calendar birthDate = Calendar.getInstance();
        birthDate.setTime(dob);
        
        Calendar today = Calendar.getInstance();
        int age = today.get(Calendar.YEAR) - birthDate.get(Calendar.YEAR);
        
                                                                                   // Adjust age if the birthday hasn't occurred yet this year
        if (today.get(Calendar.DAY_OF_YEAR) < birthDate.get(Calendar.DAY_OF_YEAR)) {
            age--;
        }
        
        return age;
    }
}
