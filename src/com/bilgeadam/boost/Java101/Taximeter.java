package com.bilgeadam.boost.Java101;

import java.util.Scanner;

public class Taximeter {
	
public static void main(String[] args) {
		
		double startPrice=10;
		double perKm=2.20;
		double total=10;
		
		System.out.println("Enter the distance you will travel: ");
		Scanner input = new Scanner (System.in);
		int distance = input.nextInt();
		
		total = distance*perKm;
		total+=startPrice;
		
				
		total = (total<20) ? 20 : total;
		System.out.println("Amount you have to pay: " +total+ " TL");

}

}
