package com.bilgeadam.boost.Java101;

import java.util.Scanner;

public class ATMProject {
	
public static void main(String[] args) {
	    
		String userName;
		String password;
		int right=3;
		int balance=3000;
		int select;
		Scanner scan = new Scanner (System.in);
		
		while (right>0) {
			
			System.out.println("Your username: ");
		    userName=scan.nextLine();
			System.out.println("Your password: ");
			password=scan.nextLine();
			
        if(userName.equals("hande") && password.equals("123")) {
				
				System.out.println("Welcome to A Bank");
				
				while(true) {
				
				System.out.println("1-Deposit\n"
						+ "2-Withdraw Money\n"
						+ "3-Balance Query\n"
						+ "4-Exit");
				
				System.out.println(" Select the operation you want to do: ");
				select = scan.nextInt();
				
				switch (select) {
				
				case 1:
					System.out.println("Amount of money you want to deposit: ");
					int amount = scan.nextInt();
					balance+=amount;
					System.out.println("The amount you deposit: "+amount);
					System.out.println("New balance: "+balance);
					break;
					
				case 2:
					System.out.println("Amount of money you want to withdraw: ");
					int price = scan.nextInt();
					if(price>balance) {
						System.out.println("Insufficient balance!");
					} else if(price<balance) {
					balance-=price;
					System.out.println("The amount you withdraw: "+price);
					System.out.println("New balance: "+balance);
					}
					break;
					
				case 3:
					System.out.println("Your balance is: "+balance);
					break;
					
				case 4:
					System.out.println("Exiting");
					break;
					
				}  
							
			
        }
        }
        else {
        	
        	System.out.println("You entered an incorrect username or password!");
        	right--;
        	
        	if (right==0) {
        		
        		System.out.println("Your account is blocked!");
        	} else {
        		
        		System.out.println("Your remaining right: "+right);
        	}
        }
        
        
			
		}
	}

}
