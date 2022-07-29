package com.bilgeadam.boost.Java101;

import java.util.Scanner;

public class AreaOfCircleSegment {

	
public static void main(String[] args) {
		
		double r;
		double a;
		double area;
		double circleSegment;
		
		
		System.out.print("Enter the radius of the circle: ");
		Scanner input = new Scanner(System.in);
		r = input.nextDouble();
		System.out.println("Enter the measure of the central angle: ");
		a=input.nextDouble();
		
		area = Math.PI*(r*r);
		circleSegment = (area*a) / 360;
		
		System.out.println("Area of the circle segment: "+circleSegment);
		
		
		

	}
}
