package com.bilgeadam.boost.Java101;

import java.util.Scanner;

public class RecursiveExample {
	
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a number : ");
		int num = scan.nextInt();
		
		numberPattern(num);
		
	}
	
	static int numberPattern(int number) {
		
		
		if (number>=0) {
			
			System.out.println(number);
			return number-5 + numberPattern(number-5);
		} else {
			
			while (number!=number) {
				
			//System.out.println(number);	
			return number+5 + numberPattern(number+5);
			
			} 
			
			
			System.out.println(number);
			
			return -1;
			
			
		
		}
	}

}
