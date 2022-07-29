package com.bilgeadam.boost.Java101;

import java.util.Scanner;

public class PerfectNumber {
	
public static void main(String[] args) {
		
		int number;
		int sum=0;
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		number = scan.nextInt();
		scan.close();
		
		for(int i=1; i<=number;i++) {
			
			if ((number%i==0) && (i!=number) ) {
				
				sum+=i;
			}
			
		}
		if (sum == number) {
			
			System.out.println(number + " is a perfect number.");
		} else {
			
			System.out.println(number+" is not a perfect number.");
		}
	}

	
	

}
