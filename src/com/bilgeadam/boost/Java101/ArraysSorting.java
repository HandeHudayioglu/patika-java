package com.bilgeadam.boost.Java101;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysSorting {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter the length of your array: ");
		int length = scan.nextInt();
		int [] list = new int[length];
		
		System.out.println("Enter the elements of your array: ");
		
		while(length>0) {
			
			int num = scan.nextInt();
			for (int i=0; i<length; i++) {
				
				list[i]=num;
			}
			length--;
		}
		
		System.out.println(Arrays.toString(list));
		
		
		
		
		Arrays.sort(list);
			
			System.out.println(Arrays.toString(list));
		}
		

		
	}


