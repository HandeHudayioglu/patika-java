package com.bilgeadam.boost.Java101;

import java.util.Scanner;

public class FlightTicketCalculator {
	
public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("How many kilometers will you travel? ");
		double km = scan.nextDouble();
		
		
		System.out.println("Please input your age: ");
		int age = scan.nextInt();
		
		double cost = km * 0.10;
		double totalCost;
		
		
		if(km>0 && age>0) {
			
			System.out.println("1-One direction  /  2-Round Trip ");
			System.out.println("Choose your trip type: ");
			int choose = scan.nextInt();
			
			if(age<12) {
				
				totalCost = cost/2;
			}
			else if(age<24) {
				
				totalCost = cost * 0.9;
			}
			else if(age>65) {
				
				totalCost = cost * 0.7;
			} 
			else {
				totalCost = cost;
			}
			
			switch (choose) {
			
			case 1:
				System.out.println("Total cost is: " + totalCost + " TL");
				break;
				
			case 2:
				System.out.println("Total cost is: " + totalCost*0.8 + " TL");
			}
			
		}
		else {
			System.out.println("You entered incorrect information!");
		}
		
	}


}
