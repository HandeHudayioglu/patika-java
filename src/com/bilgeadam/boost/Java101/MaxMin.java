package com.bilgeadam.boost.Java101;

import java.util.Scanner;

public class MaxMin {
	
public static void main(String[] args) {
		
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("How many numbers will you enter? ");
		int number = scan.nextInt();
		
		
		
		for(int i=1; i<=number; i++) {
			
			System.out.print("Number "+i+": ");
			int input = scan.nextInt();
			
		
			
			if(i==1) {
				
				min=input;
				max=input;
			}
			if(input<min) {
				
				min=input;
			}
			if (input>max) {
				
				max=input;
			}
			
			
		}
		System.out.println("Min value: "+min);
		System.out.println("Max value: "+max);
		
		
	}

}
