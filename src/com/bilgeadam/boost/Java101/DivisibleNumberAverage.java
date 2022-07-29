package com.bilgeadam.boost.Java101;

import java.util.Scanner;

public class DivisibleNumberAverage {
	
public static void main(String[] args) {
		
		int count=0 ;
		int result=0;
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter a number: ");
		int number = scan.nextInt();
		
		for (int i=0; i<=number; i++) {
			
			if((i%3==0) && (i%4==0) ) {
				
				count++;
				result+=i;
			}
		}
		if(count != 0) {
		System.out.println(result/count);
		}
		
		else {
			
			System.out.println("The number that met the conditions was not found!");
		}
	}


}
