package com.bilgeadam.boost.Java101;

import java.util.Scanner;

public class PasswordCreate {

	
	public static void main(String[] args) {
		
		String password="password";
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your password: ");
		String input = scan.nextLine();
		
		String answer="";
		
		if(input.equals(password)) {
			
			System.out.println("Login successful!");
		} else {
			
			System.err.println("Wrong password!");
			System.out.println("Do you want to reset password?");
			answer=scan.nextLine();
		}
		
		if(answer.equalsIgnoreCase("yes")) {
			
			System.out.println("Enter your new password: ");
			String newPassword = scan.nextLine();
			
			if(newPassword.equals(password)) {
				System.err.println("Create another password!");
			} else {
				System.out.println("Password created.");
			}
		} 
	}

}
