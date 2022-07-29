package com.bilgeadam.boost.Java101;

import java.util.Scanner;

public class ChineseZodiac {
	
public static void main(String[] args) {
		
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter your year of birth: ");
		int year = scan.nextInt();
		
		int zodiac = year%12;
		
		switch(zodiac) {
		
		case 0:
			System.out.println("Monkey");
			break;
		case 1:
			System.out.println("Cockerel");
			break;
		case 2:
			System.out.println("Dog");
			break;
		case 3:
			System.out.println("Pig");
			break;
		case 4:
			System.out.println("Mouse");
			break;
		case 5:
			System.out.println("Ox");
			break;
		case 6:
			System.out.println("Tiger");
			break;
		case 7:
			System.out.println("Rubbit");
			break;
		case 8:
			System.out.println("Dragon");
			break;
		case 9:
			System.out.println("Snake");
			break;
		case 10:
			System.out.println("Horse");
			break;
		case 11:
			System.out.println("Sheep");
			break;
		}

	}


}
