
package com.deloitte.lab6.ex4;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class 	App {
    
    public Map<String, String> assignMedals(Map<String, Integer> studentScores) {
    	
        Map<String, String> awardedMedals = new HashMap<>();
        
        for (Map.Entry<String, Integer> entry : studentScores.entrySet()) {
        	
            String studentId = entry.getKey();
            
            Integer score = entry.getValue();
            
            
            if (score >= 90) {
            	
                awardedMedals.put(studentId, "Gold");
                
            } else if (score >= 80) {
            	
                awardedMedals.put(studentId, "Silver");
                
            } else if (score >= 70) {
            	
                awardedMedals.put(studentId, "Bronze");
                
            }
        }
        
        return awardedMedals;
    }

    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);
        
        Map<String, Integer> scores = new HashMap<>();
        
        App medalAwarder = new App();

        
        System.out.println("Enter student scores (enter 'done' to finish):");
        
        while (true) {
        	
            System.out.print("Enter Student ID: ");
            
            String studentId = scanner.nextLine();
            
            if (studentId.equalsIgnoreCase("done")) {
            	
                break;
            }

            System.out.print("Enter Score for " + studentId + ": ");
            
            int score = Integer.parseInt(scanner.nextLine());
            
            scores.put(studentId, score);
        }
        

        Map<String, String> results = medalAwarder.assignMedals(scores);
        
        System.out.println("Medal Results: " + results);
        

        scanner.close();
    }
}
