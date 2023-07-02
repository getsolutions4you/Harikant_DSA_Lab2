package com.currdenominations.main;
import com.currdenominations.services.*;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SortCurrency sCurrency = new SortCurrency();
		CalculateMinCurrency cMinCurrency = new CalculateMinCurrency();
		
		Scanner scanner = new Scanner(System.in);
		
        // Input the size of currency denominations
        System.out.println("Enter the size of currency denominations: ");
        int size = scanner.nextInt();

        // Input the currency denominations values
        System.out.println("Enter the currency denominations value: ");
        int[] denominations = new int[size];
        for (int i = 0; i < size; i++) {
            denominations[i] = scanner.nextInt();
        }

        // Input the amount to be paid
        System.out.println("Enter the amount you want to pay: ");
        int amount = scanner.nextInt();
		
        // Sort Array Descending Order
		int[] sortArr = sCurrency.currSortDescending(denominations);
		
		// Get Minimum currency denominations
		cMinCurrency.minCurrCalculate(size, amount, sortArr);
		
        scanner.close();

	}

}
