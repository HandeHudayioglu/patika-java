package com.bilgeadam.boost.Java101;

import java.util.Scanner;

public class PassTheClass {
	
	public static void main(String[] args) {
		
		
		 int turkish;
		 int math;
		 int physics;
		 int chemical;
		 int music;
		 
		double avarage=0 ;
		Scanner scan = new Scanner (System.in) ;
		System.out.println("Enter your Turkish score: ") ;
		turkish = scan.nextInt();
		System.out.println("Enter your Math score: ") ;
		math = scan.nextInt() ;
		System.out.println("Enter your Physics score: ") ;
		physics = scan.nextInt() ;
		System.out.println("Enter your Chemical score: ") ;
		chemical = scan.nextInt() ;
		System.out.println("Enter your Music score: ");
		music = scan.nextInt();
		
		if((turkish<0||turkish>100)||(math<0||math>100)||(physics<0||physics>100)||(chemical<0||chemical>100)||(music<0|music>100)) {
			System.out.println("Check your scores!");
			
		} else {
		avarage = (turkish+math+physics+chemical+music)/5 ;
		
		String result = avarage>55.0 ? "Passed":"Fail";
		System.out.println(result);
		
	}

}

}
