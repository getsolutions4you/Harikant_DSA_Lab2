package com.transaction.services;

import java.util.Scanner;

public class DailyTransaction {
	
	public int[] doDailyTransaction(Scanner sc) {
		
		System.out.println("enter the size of transaction array");
		
		int tranSize = sc.nextInt();
		int[] array = new int[tranSize];
		
		System.out.println("enter the values of array");
		
		for(int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		return array;
	}
	
	public void calculateTarget(int valTarget, int[] newArray) {
		int sum = 0;
		int count = 0;
		for(int i = 0; i < newArray.length; i++) {
			sum += newArray[i];
			count++;
			if(sum >= valTarget) {
				System.out.println("Target achieved after "+count+ " transactions ");
				break;
			}
		}
		
		if(valTarget > sum) {
			System.out.println("Given target is not achieved");
		}
		
		System.out.println("");
	}

}
