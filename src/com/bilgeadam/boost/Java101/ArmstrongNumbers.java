package com.bilgeadam.boost.Java101;

import java.util.Scanner;

public class ArmstrongNumbers {

	
public static void main(String[] args) {
		
		// 2456 ?= (2*2*2*2)+ (4*4*4*4) + (5*5*5*5)+(6*6*6*6) ==> armstrong 
		// 23 != (2*2) +(3*3)  not armstrong
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = scan.nextInt();
		
		int tempNumber=number;
		int counterDigit=0;
		int digValue;
		int digPower ;
		int total=0;
		
		while(tempNumber!=0) {
			
			tempNumber/=10;
			counterDigit++;  // GİRİLEN SAYININ KAÇ BASAMAKLI OLDUĞUNU BULDUK
			
		}
		
//		tempNumber = number;
//		while (tempNumber!=0) {
//			
//			digValue=tempNumber%10;
//			System.out.println(digValue);    her bir basamakta bulunan sayıları yazdırdık
//			tempNumber/=10;
//			
//			
//		}
//		
		tempNumber = number;
		while(tempNumber!=0) {
			
			digValue=tempNumber%10;
			digPower=1;
			for(int i=1; i<=counterDigit;i++) {
				
				digPower*=digValue;
			}
			total+=digPower;
			tempNumber/=10;
		}
		
		if(total==number) {
			
			System.out.println(number+" is an armstrong number.");
		}
		else {
			System.out.println(number+" isn't an armstrong number.");
		}

	}
}
