package com.deloitte.lab2.ex1;



import java.util.Scanner;

public class App1 {
    
    static int calcSecondLargest(Integer[] array, int size) {
        if (size < 2) {
            throw new IllegalArgumentException("Array must contain at least two elements.");
        }

        int first = Integer.MIN_VALUE;  // Largest number
        int second = Integer.MIN_VALUE; // Second largest number

        for (int i = 0; i < size; i++) {
            if (array[i] > first) {
                second = first; // Update second largest
                first = array[i]; // Update largest
            } else if (array[i] > second && array[i] < first) {
                second = array[i]; // Update second largest
            }
        }

        if (second == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("There is no second largest element.");
        }

        return second;
    }

    public static void main(String[] args) {
        int size;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array");
        size = sc.nextInt();

        Integer[] array = new Integer[size];

        System.out.println("Enter the integers");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        int secondLargest = calcSecondLargest(array, size);
        System.out.println("The second largest number is: " + secondLargest);

        sc.close();
    }
}
