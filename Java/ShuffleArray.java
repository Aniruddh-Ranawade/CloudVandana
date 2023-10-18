package com.app.cloudVandana;

import java.util.Random;

public class ShuffleArray {
	
	 public static void main(String[] args) {
	        int[] arr = {1, 2, 3, 4, 5, 6, 7};
	        
	        // Create a Random object to generate random indices
	        Random random = new Random();

	        for (int i = arr.length - 1; i > 0; i--) {
	            // Generate a random index between 0 (inclusive) and i (exclusive)
	            int randomIndex = random.nextInt(i+1);

	            // Swap the elements at randomIndex and i
	            int temp = arr[i];
	            arr[i] = arr[randomIndex];
	            arr[randomIndex] = temp;
	        }

	        // Print the shuffled array
	        for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i]+ " ");
			}
	    }

	

}
