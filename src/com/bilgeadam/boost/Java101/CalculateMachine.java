package com.bilgeadam.boost.Java101;

import java.util.Scanner;

public class CalculateMachine {

	
public static void main(String[] args) {
		
		
		CalculateMachine cm= new CalculateMachine();
		cm.showSelect();
		Scanner scan = new Scanner (System.in);
		int select = scan.nextInt();
		switch (select) {
		case 1:
			cm.add();
		case 2:
			cm.subs();
		case 3:
			cm.multi();
		case 4:
			cm.div();
		case 5:
			cm.square();
		case 6:
			cm.exp();
		case 7:
			cm.mod();
		case 8:
			cm.factorial();
		case 9:
			
		}
		
		
	}
	
	public void showSelect() {
		
		System.out.println("1-Addition");
		System.out.println("2-Subtraction");
		System.out.println("3-Multiplication");
		System.out.println("4-Division");
		System.out.println("5-Square");
		System.out.println("6-Exponential");
		System.out.println("7-Mod");
		System.out.println("8-Factorial");
		System.out.println("Select the action you want to do:");
		
	}
	


	public void add() {
		
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter first numbers:");
		double first = scan.nextDouble();
		System.out.println("Enter second numbers:");
		double second = scan.nextDouble();
		
		double result = first+second;
		System.out.println(result);
		
	}
	
	public void subs() {
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter first numbers:");
		double first = scan.nextDouble();
		System.out.println("Enter second numbers:");
		double second = scan.nextDouble();
		
		double result = first-second;
		System.out.println(result);
		
		
	}
	
	public void multi() {
		

		Scanner scan = new Scanner (System.in);
		System.out.println("Enter first numbers:");
		double first = scan.nextDouble();
		System.out.println("Enter second numbers:");
		double second = scan.nextDouble();
		
		double result=first*second;
		System.out.println(result);
		
	}
	
	public void div() {
		

		Scanner scan = new Scanner (System.in);
		System.out.println("Enter first numbers:");
		double first = scan.nextDouble();
		System.out.println("Enter second numbers:");
		double second = scan.nextDouble();
		
		double result=first/second;
		System.out.println(result);
	}
	
	public void square() {
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter a number:");
		double number = scan.nextDouble();
		
		double result = Math.sqrt(number);
		System.out.println(result);
		
		
	}
	
	public void exp() {
		

		Scanner scan = new Scanner (System.in);
		System.out.println("Enter first numbers:");
		double first = scan.nextDouble();
		System.out.println("Enter second numbers:");
		double second = scan.nextDouble();
		double result = 1;
		for(int i=1; i<=second; i++) {
			
			result*=first;
		}
		System.out.println(result);
		
	}
	
	public void mod() {
		

		Scanner scan = new Scanner (System.in);
		System.out.println("Enter first numbers:");
		double first = scan.nextDouble();
		System.out.println("Enter second numbers:");
		double second = scan.nextDouble();
		
		double result = first%second;
		System.out.println(result);
	}
	
	public void factorial() {
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter a number:");
		int number = scan.nextInt();
		int result=1;
		
		for(int i=1; i<=number; i++) {
			result*=i;
		}
		System.out.println(result);
	}
}
