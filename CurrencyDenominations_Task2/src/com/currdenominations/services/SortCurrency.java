package com.currdenominations.services;

public class SortCurrency {
	
	public int[] currSortDescending(int[] array) {
        int n = array.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] < array[j + 1]) {
                    // Swap elements
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }

            // If no swapping occurred in the inner loop, the array is already sorted
            if (!swapped) {
                break;
            }
        }
		return array;
	}

}
