package com.bilgeadam.boost.Java101;

import java.util.Arrays;

public class ArrayRepeatingEvenNum {

	static boolean isFind(int [] arr, int value) {
		
		for (int i : arr) {
			
			if(i==value) {
				return true;
			}
			
		}
		return false;
	
		
	}
	
	
	public static void main(String[] args) {
		
		
		
		int [] list = {8,7,56,3,5,8,4,4,2,5,4};
		
		int [] duplicate = new int [list.length];
		int startIndex=0;
		
		for(int i=0 ; i< list.length; i++) {
			
			for (int j=0; j<list.length; j++) {
				
				if((i!=j) && (list[i]==list[j]) && (list[i]%2==0)) {
					
					if(!isFind(duplicate,list[i])) {
					duplicate[startIndex++] = list[i];
					}
					break;
				}
				
			}
		}
		
//		for (int i : duplicate) {  //bunu eklediğimizde 0 lar gidiyor
//			
//			if (i!=0) {
//				
//				System.out.println(i);
//			}
			
		}

	}

}
