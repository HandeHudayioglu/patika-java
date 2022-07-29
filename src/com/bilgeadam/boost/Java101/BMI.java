package com.bilgeadam.boost.Java101;

import java.util.Scanner;

public class BMI {
	
	public static void main(String[] args) {

		double height, weight, BMI;
		

		Scanner scanner = new Scanner(System.in);

		

		System.out.print("Enter your height(meter) :");
		height = scanner.nextDouble();

		System.out.print("Enter your weight :");
		weight = scanner.nextDouble();

		BMI = weight / (height * height);
		
		System.out.println("Your body mass index: "+BMI);

		
		}

}
