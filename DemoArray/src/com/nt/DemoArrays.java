package com.nt;

import java.util.Scanner;

public class DemoArrays {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Use meaningful variable names
        System.out.print("Enter the number of integer values to hold in the array: ");
        int size = scanner.nextInt();  // Better to name variables clearly

        // Create an array to hold Integer objects
        Integer[] integers = new Integer[size];
        System.out.println("Enter " + size + " integer values:");

        // Input integers into the array
        for (int i = 0; i < size; i++) {
        	// No need to use new Integer() since autoboxing is supported
            integers[i] = scanner.nextInt();  
        }

        // Display the integers using a traditional for loop
        System.out.println("Displaying the integers:");
        for (int i = 0; i < size; i++) {
        	
            System.out.print(integers[i] + " ");  // Directly printing the Integer object
        }
        System.out.println();  // For a new line

        // Display the integers using an enhanced for loop
        System.out.println("Displaying the integers (using enhanced for loop):");
        for (Integer integer : integers) {
            System.out.print(integer + " ");  // Directly printing the Integer object
        }
        System.out.println();  // For a new line

        // Close the scanner to avoid resource leaks
        scanner.close();
    }
}
