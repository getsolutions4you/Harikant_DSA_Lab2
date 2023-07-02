package com.transaction.main;
import com.transaction.services.DailyTransaction;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		DailyTransaction dTarget = new DailyTransaction();
		Scanner sc = new Scanner(System.in);
		int[] newArray = dTarget.doDailyTransaction(sc);
		
		
		System.out.println("enter the total no of targets that needs to be achieved");
		int noTarget = sc.nextInt();

		while(noTarget != 0) {
			System.out.println("enter the value of target");
			int valTarget = sc.nextInt();
			
			dTarget.calculateTarget(valTarget, newArray);
			noTarget--;
		}	
		sc.close();
	}
}
