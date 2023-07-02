package com.currdenominations.services;

public class CalculateMinCurrency {
	public void minCurrCalculate(int size, int amount, int[] sortArr) {
		
		// Calculate the minimum number of notes
        int[] notes = new int[size];
        for (int i = 0; i < size; i++) {
            notes[i] = amount / sortArr[i];
            amount %= sortArr[i];
        }

        // Print the minimum number of notes
        System.out.println("Your payment approach in order to give the minimum number of notes will be:");
        for (int i = 0; i < size; i++) {
            if (notes[i] > 0) {
                System.out.println(sortArr[i] + ":" + notes[i]);
            }
        }
		
	}
}
