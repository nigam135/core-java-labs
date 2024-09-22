//Exercise 3: Create a method which accepts an integer array, reverse the numbers in the array and returns the resulting array in sorted order


package com.deloitte.lab2.ex3;

import java.util.Arrays;
import java.util.Scanner;

public class App {
	
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        
        System.out.println("How many elements do you want to enter?");
        int num = sc.nextInt();
        
        
        int[] arr = new int[num];
        
        
        System.out.println("Enter elements: ");
        
        for (int i = 0; i < num; i++) {
        	
            arr[i] = sc.nextInt();
        }
        
        
       
        System.out.println("Elements sorted are: ");
        
        for (int a : getSorted(arr)) {
        	
            System.out.print(a + " ");
        }
        
        sc.close(); 
    }
    
    public static int[] getSorted(int[] arr) {
    	
        int n = arr.length;
        
        int[] reverse = new int[n];
        
       
        for (int i = 0; i < n; i++) {
        	
            reverse[i] = arr[n - 1 - i];
            
        }
       
        Arrays.sort(reverse);
        
        return reverse;
    }
}
