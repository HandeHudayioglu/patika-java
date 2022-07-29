package com.bilgeadam.boost.Java101;

import java.util.Scanner;

public class GroceryStoreProgram {
	
public static void main(String[] args) {
		
		
		double pearKg,appleKg,tomatoesKg,bananaKg,aubergineKg;
		double kgPear = 2.14;
		double kgApple = 3.67;
		double kgTomatoes = 1.11;
		double kgBanana = 0.95;
		double kgAubergine = 5.0;
		double total =0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("How many kilograms of pears?");
		pearKg = scan.nextDouble();
		double amountPear = pearKg*kgPear;
		System.out.println("How many kilograms of apples?");
		appleKg = scan.nextDouble();
		double amountApple = appleKg*kgApple;
		System.out.println("How many kilograms of tomatoes?");
		tomatoesKg = scan.nextDouble();
		double amountTomatoes = tomatoesKg*kgTomatoes;
		System.out.println("How many kilograms of bananas?");
		bananaKg = scan.nextDouble();
		double amountBananas = bananaKg*kgBanana;
		System.out.println("How many kilograms of aubergines?");
		aubergineKg = scan.nextDouble();
		double amountAubergine = aubergineKg*kgAubergine;
		
		total = amountPear+amountApple+amountTomatoes+amountBananas+amountAubergine;
		
		System.out.println("Total: "+total);
		
		
		
		
		
	}

}
