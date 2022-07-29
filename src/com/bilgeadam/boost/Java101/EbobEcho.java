package com.bilgeadam.boost.Java101;

import java.util.Scanner;

public class EbobEcho {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the first number: ");
		int value1=scan.nextInt();
		System.out.print("Enter the second number: ");
		int value2=scan.nextInt();
		int ebob=1;
		
		for(int i=value1; i>0; i--) {
			
			if (value1%i==0 && value2%i==0) {
				
				ebob=i;
				break;
			}
		}
    
		System.out.println("Ebob: "+ebob);
		System.out.println("Ekok: "+ (value1*value2)/ebob);
	}

}
