package com.bilgeadam.boost.Java101;

import java.util.Scanner;

public class AreaOfTriangle {
	
public static void main(String[] args) {
		
		int edge1,edge2,edge3;
		double u;
		double area;
		double result;
		
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the lengths of the right edges of the triangle. ");
		System.out.print("First edge: ");
		edge1=input.nextInt();
		System.out.print("Second edge: ");
		edge2=input.nextInt();
		System.out.print("Third edge: ");
		edge3=input.nextInt();
		
		
		u = (edge1+edge2+edge3)/2;
		result =( u*(u-edge1)*(u-edge2)*(u-edge3));
		area = Math.sqrt(result);
		System.out.println("Area of your triangle: "+area);
		
		
		
		
		
	    
		
	}


}
