package com.bilgeadam.boost.Java101;

import java.util.Scanner;

public class PalindromicWord {

	
	static boolean isPalindrom(String word) {
		
		int i=0;
		int j=word.length()-1;
		
		while(i<j) {
		if ( word.charAt(i) != word.charAt(j)) {
			
			return false;
		}
			i++;
			j--;
		}
		
		return true;
		
	}
	
	static boolean isPalindrom2(String word) {
		
		String reverse="";
		
		for(int i=word.length()-1; i>=0; i--) {
			
			reverse+=word.charAt(i);
		}
		
		if(word.equals(reverse)) {
			
			return true;
		} else {
			return false;
		
		}
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a word: ");
		String word = scan.nextLine();
		
		
		//System.out.println(isPalindrom(word));
		System.out.println(isPalindrom2(word));
		
	}

}
