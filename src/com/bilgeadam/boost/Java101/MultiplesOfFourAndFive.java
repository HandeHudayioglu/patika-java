package com.bilgeadam.boost.Java101;

import java.util.Scanner;

public class MultiplesOfFourAndFive {
	
public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = scan.nextInt();
		
		for(int i=1; i<=n; i*=4) {
			
			System.out.println("Multiples of 4: "+i);
		}
		
		for (int k=1; k<=n; k*=5) {
			
			System.out.println("Multiples of 5: "+k);
		}
	}

}
