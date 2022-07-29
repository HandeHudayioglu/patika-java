package com.bilgeadam.boost.Java101;

import java.util.Scanner;

public class SuggestionsforWeather {
	
public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		System.out.print("Enter the air temperature: ");
		
		int temp=scan.nextInt();
		
		if(temp==30 || temp>30) {
			System.out.println("You can swim!");
		}
		else if (temp>4 && temp<30) {
			System.out.println("You can go to the cinema!");
		}
		else if (temp==4 || temp<4) {
			System.out.println("You can sky!");
		}
		

	}

}
