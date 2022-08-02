package com.bilgeadam.boost.Java101;

public class IsPowerOf2 {

	public static void main(String[] args) {
		
		
		int k=0;
		int a = 87;
		
		while(a>1) {
			
			if(a%2==0) {
				k=1;
				
			} else {
				
				k=2;  //2 ye bölümünden kalan sıfır değilse döngüden çıksın diye break koyduk
				break;
			}
			
			a=a/2;
		}
	
         if(k==1) {
        	 
        	 System.out.println(a +" sayısı 2 nin kuvvetidir.");
         } else {
        	 
        	 System.out.println(a+ " sayısı 2'nin kuvveti değildir.");
         }
		

	}

}
