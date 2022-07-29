package com.bilgeadam.boost.Java101;

import java.util.Scanner;

public class HarmonicNumber {
	
public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 'n' value: ");
		int n = scan.nextInt();
		double i=1;
		double total=0;
		
		while(i<=n) {
			
			total+=1/i;
			i++;
		}
		
		
		System.out.println("Total: "+total);

		
	}

}
