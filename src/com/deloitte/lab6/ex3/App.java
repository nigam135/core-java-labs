//// Method to return a map of numbers and their squares

package com.deloitte.lab6.ex3;
import java.util.HashMap;
import java.util.Map;

public class App {

    
    public Map<Integer, Integer> getSquares(int[] nums) {
    	
        Map<Integer, Integer> squares = new HashMap<>();
        
        for (int num : nums) {
        	
            squares.put(num, num * num);
        }
        
        return squares;
    }

    public static void main(String[] args) {
    	
        App calculator = new App();
        

        int[] numbers = {1, 2, 3, 4, 5};

        Map<Integer, Integer> result = calculator.getSquares(numbers);
        
  
        System.out.println("Numbers and their squares: " + result);
    }
}
