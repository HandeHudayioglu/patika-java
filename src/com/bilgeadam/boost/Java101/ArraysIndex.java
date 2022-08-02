package com.bilgeadam.boost.Java101;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysIndex {

	
	//bir listede, girilen sayıya en yakın büyük ve küçük indeksi bulma
	public static void main(String[] args) {
		
		
		int [] list = {15,12,788,1,-1,-778,2,0};
		
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		int closestSmaller = num;
		int closestGreater = list[0];

		
		
		Arrays.sort(list);
	        
		
		for (int i : list) {
			
			 if (i <num)
		            
	           closestSmaller = i;  //burada break koymadığımıza dikkt et
			
			
			if(i>num) {
				
				closestGreater = i;
				break;
			}
			
		}
		
		System.out.println("The smaller closest number to " + num + " is " + closestSmaller);
		System.out.println("The greater closest number to " + num + " is " + closestGreater);
		
				
		
		
		
	}
}
