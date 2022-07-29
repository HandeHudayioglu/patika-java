package com.bilgeadam.boost.Java101;

import java.util.Scanner;

public class VATCalculation {
	
	public static void main(String[] args) {
		
		double amount;
		double amountWithVat;
		double vat;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the amount: ");
		amount = input.nextDouble();
		
		
		if((0<amount) && (amount<1000)) {
			vat = (amount*18)/100;
			amountWithVat=amount+vat;
			System.out.println("VAT amound: " + vat);
			System.out.println("Amound with VAT: " + amountWithVat);
		}
		else {
			
			vat = (amount*8) /100;
			amountWithVat=amount+vat;
			System.out.println("VAT amound: " + vat);
			System.out.println("Amound with VAT: " + amountWithVat);
			
			
		}
		
		}

}
