package com.bilgeadam.boost.Java101;

import java.util.Scanner;

public class MultiplesOfTwoAndFour {
	
public static void main(String[] args) {
		
		int n;
		int total=0;
		Scanner scan = new Scanner (System.in);
		
		do {
			System.out.println("Enter a number: ");
			n = scan.nextInt();
			if(n%4==0) {
				
				total+=n;
				
			}
			
			
		} while (n%2==0);
		
		System.out.println("Sum of numbers divisible by 2 and 4: " +total);
	}


}
