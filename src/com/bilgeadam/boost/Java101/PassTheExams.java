package com.bilgeadam.boost.Java101;

import java.util.Scanner;

public class PassTheExams {
	
	public static void main(String[] args) {
		 int turkish;
		 int math;
		 int physics;
		 int chemical;
		 int history;
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
		System.out.println("Enter your History score: ");
		history = scan.nextInt();
		System.out.println("Enter your Music score: ");
		music = scan.nextInt();
		avarage = (turkish+math+physics+chemical+history+music)/6 ;
		
		String result = avarage>50.0 ? "Passed":"Fail";
		System.out.println(result);

		

	}


}
