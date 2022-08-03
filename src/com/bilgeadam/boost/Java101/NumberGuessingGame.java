package com.bilgeadam.boost.Java101;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

	public static void main(String[] args) {
		
		int right=0;
		boolean isWin=false;
		boolean isWrong=false;
		int [] wrong = new int [5];
		
		Random random = new Random();
		int number = random.nextInt(100);
	
		Scanner scan = new Scanner(System.in);
		
		
		while (right<5) {
			
			System.out.println("Enter your guess: ");
			int num = scan.nextInt();
			
			if(num<0 || num>99) { 
			 System.out.println("Please enter a number between 0 and 100!"); 
		
			   if(isWrong) {  //isWrongun ilk hali false tu yani daha önce hata yapılmıştı zaten 
				   
				   right++;
				   System.out.println("You shoulda be more careful!(More than 1 wrong entry)");
				   System.out.println("Remaining right: "+(5-right));
			   } else {
				   
				   isWrong = true;
				   System.out.println("Your next wrong entry will be deducted from you!");
				   
			   }
			   continue;
				   
			}   
			
			
			if (num==number) {
				System.out.println("Congratulations! You guessed right.");  isWin=true;  break; 
			}
			else {
				System.out.println("You couldn't find the right number!");
			if(num>number) {
				System.out.println(num +" is greater than the number you need to find."); }
			else { 
				System.out.println(num + " is smaller than the number you need to find.");
			}
			
			wrong[right++]=num;
			System.out.println("Remaining right: "+(5-right));
			}
			                 
		}	
		
		if(!isWin) {
			
			
			System.out.println("Game over!");
			
			if(!isWrong) {
				
				System.out.println("Your guesses: " +Arrays.toString(wrong));
			}
		}

	}

}

