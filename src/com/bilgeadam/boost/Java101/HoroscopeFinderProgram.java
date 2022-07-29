package com.bilgeadam.boost.Java101;

import java.util.Scanner;

public class HoroscopeFinderProgram {
	
	public static void main(String[] args) {
		
		 int month;
		 int day;
		 
		 Scanner scan = new Scanner(System.in);
		 
		 System.out.println("Enter the month you were born(1-12): ");
		 month = scan.nextInt();
		 
		 System.out.println("Enter the day you were born(1-31): ");
		 day = scan.nextInt();
		 
		 if(month==1) {
			 
			 if(day<=21) {
				 System.out.println("Capricorn");
			 }
			 else if(day>21 && day<=31) {
				 System.out.println("Aquarius");
			 }
			 else {
				 System.out.println("You entered an invalid day!");
			 }
		 }
		 else if (month==2){
	         if (day<=19){
	             System.out.println("Aquarius");
	         }else if (day>19 && day<=31){
	             System.out.println("Pisces");
	         }else{
	             System.out.println("You entered an invalid day!");
	         }
		  
		 }
		 else if (month==3){
	         if (day<=20){
	             System.out.println("Pisces");
	         }else if (day>20 && day<=31){
	             System.out.println("Aries");
	         }else{
	             System.out.println("You entered an invalid day!");
	         }
	     }
		 else if (month==4){
	         if (day<=20){
	             System.out.println("Aries");
	         }else if (day>20 && day<=31){
	             System.out.println("Taurus");
	         }else{
	             System.out.println("You entered an invalid day!");
	         }
	     }
		 else if (month==5){
	         if (day<=21){
	             System.out.println("Taurus");
	         }else if (day>21 && day<=31){
	             System.out.println("Gemini");
	         }else{
	             System.out.println("You entered an invalid day!");
	         }
	     }
	     else if (month==6){
	         if (day<=22){
	             System.out.println("Gemini");
	         }else if (day>22 && day<=31){
	             System.out.println("Cancer");
	         }else{
	             System.out.println("You entered an invalid day!");
	         }
	     }
	     else if (month==7){
	         if (day<=22){
	             System.out.println("Cancer");
	         }else if (day>22 && day<=31){
	             System.out.println("Leo");
	         }else{
	             System.out.println("You entered an invalid day!");
	         }
	     }
	     else if (month==8){
	         if (day<=22){
	             System.out.println("Leo");
	         }else if (day>22 && day<=31){
	             System.out.println("Virgo");
	         }else{
	             System.out.println("You entered an invalid day!");
	         }
	     }
	     else if (month==9){
	         if (day<=22){
	             System.out.println("Virgo");
	         }else if (day>22 && day<=31){
	             System.out.println("Libra");
	         }else{
	             System.out.println("You entered an invalid day!");
	         }
	     }
	     else if (month==10){
	         if (day<=21){
	             System.out.println("Libra");
	         }else if (day>21 && day<=31){
	             System.out.println("Scorpio");
	         }else{
	             System.out.println("You entered an invalid day!");
	         }
	     }
	     else if (month==11){
	         if (day<=21){
	             System.out.println("Scorpio");
	         }else if (day>21 && day<=31){
	             System.out.println("Sagittarius");
	         }else{
	             System.out.println("You entered an invalid day!");
	         }
	     }else if (month==12){
	         if (day<=21){
	             System.out.println("Sagittarius");
	         }else if (day>21 && day<=31){
	             System.out.println("Capricorn");
	         }else{
	             System.out.println("You entered an invalid day!");
	         }
	     }else{
	         System.out.println("Enter a month between 1 and 12!");
	     }
			
			
		}


}
