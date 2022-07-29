package com.bilgeadam.boost.Java101;

public class InvertedTriangle {
	
	
	
	public static void main(String[] args) {
	
		
        for (int i=10; i>0; i--) {
			
			for (int j = (10-i); j>0; j--) {
				System.out.print(" ");
			}
			for(int k= (2*i)-1; k>0; k--) {
				
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
