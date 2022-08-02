package com.bilgeadam.boost.Java101;

public class ArraysHarmonicAverage {

	public static void main(String[] args) {
		
		
		int [] numbers = {3,8,9,7,5};
		
		 double harmonicSeriesSum = 0;
		 
		 for (int i : numbers) {
			
			 harmonicSeriesSum+=(1.0/i);
		}
		
		 double harmonicSeriesAverage = numbers.length / harmonicSeriesSum;
		
		System.out.println("The harmonic average of the numbers in the array: "+ harmonicSeriesAverage);

	}

}
