package com.bilgeadam.boost.Java101;

import java.util.Scanner;

public class ExponentialExpressions {
	
public static void main(String[] args) {
		
		int result=1;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the base number: ");
		int base = scan.nextInt();
		System.out.println("Enter the power number: ");
		int power = scan.nextInt();
		
		for (int i=0; i<power;i++) {
			
			result*=base;
		}
		
		System.out.println(result);

	}

	
	

}
