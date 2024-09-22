
//Exercise 4: Create a method which accepts an integer array and removes all the duplicates in the array. Return the resulting array in descending order


package com.deloitte.lab2.ex4;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.Collections;

public class App {


    static int[] getValues(int[] array, int size) {
    	
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the elements of the array:");
        
        for (int i = 0; i < size; i++) {
        	
            array[i] = sc.nextInt();
        }
        return array;
    }


    static Integer[] removeDuplicatesAndSort(int[] array) {
    	

        Set<Integer> set = new HashSet<>();
        
        for (int num : array) {
        	
            set.add(num);
        }


        Integer[] uniqueArray = set.toArray(new Integer[0]);
        

        Arrays.sort(uniqueArray, Collections.reverseOrder());

        return uniqueArray;
    }

    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the size of the array:");
        
        int size = sc.nextInt();
        

        int[] array = new int[size];
        
        getValues(array, size);

        Integer[] resultArray = removeDuplicatesAndSort(array);


        System.out.println("Resulting array in descending order (without duplicates):");
        
        for (int num : resultArray) {
        	
            System.out.print(num + " ");
            
        }

        sc.close(); 
    }
}
