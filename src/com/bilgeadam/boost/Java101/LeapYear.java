package com.bilgeadam.boost.Java101;

import java.util.Scanner;

public class LeapYear {
	
public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a year: ");
		int year = scan.nextInt();
		
		if(year%4==0) {
			
			if(year%100==0) {
				
				if(year%400==0) {
					
					System.out.println("Leap year");
				} else {
					System.out.println("Not leap year!");
				}
			}
			
		}
		else {
			
			System.out.println("Not leap year!");
		}

	}


}
