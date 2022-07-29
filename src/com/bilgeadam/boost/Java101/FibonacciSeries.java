package com.bilgeadam.boost.Java101;

import java.util.Scanner;

public class FibonacciSeries {
	
	
	
public static void main(String[] args) {
		
		
		int n1=0;
		int n2=1;
		int n3;
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("How many numbers would you like to print in the series?");
		int input=scan.nextInt();
		System.out.print(n1+" "+n2);
		scan.close();
		
		for (int i=2; i<input; i++) {
			
			n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
		}
		System.out.println();
		
	}


}
