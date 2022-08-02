package com.bilgeadam.boost.Java101;

import java.util.Arrays;

public class MatrixTranspose {

	public static void main(String[] args) {
		
		
		int i=3;
		int j=2;
		int [][] matrix = new int [i][j];
		
		matrix[0][0]= 5;
		matrix[0][1]= 3;
		matrix[1][0]= 2;
		matrix[1][1]= 7;
		matrix[2][0]= 4;
		matrix[2][1]= 0;
		
		
		for (int[] mtx : matrix) {
			System.out.println(Arrays.toString(mtx));
		}
		
		System.out.println("************");
		
		int [][] transpose = new int [j][i];
		
		for (int x=0; x<j; x++) {
			for(int y=0; y<i; y++) {
				transpose[x][y]=matrix[y][x];
			}
		}
	
		for (int[] trs : transpose) {
			
			System.out.println(Arrays.toString(trs));
		}
										


	}

}
