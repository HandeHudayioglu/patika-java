package com.bilgeadam.boost.Java101.minesweepergame;

import java.util.Random;
import java.util.Scanner;

public class MinesweeperGame {
	
	 int rowNum;
	 int colNum;
	 int [][] map;  
	 int [][] currentlyMap;
	 int size;
	 boolean game = true;
	 
	 
	 Random rnd = new Random();
	 Scanner scan = new Scanner(System.in);
	
	
	public MinesweeperGame(int rowNum, int colNum) {
		super();
		this.rowNum = rowNum;
		this.colNum = colNum;
		this.map = new int [rowNum][colNum];
		this.currentlyMap = new int [rowNum][colNum];
		this.size = rowNum*colNum;
	}
	
	
	public void run() {
		
		int successChoice=0;
		
		putMine();
		print(map);
		System.out.println("Game has started!");
		while(game) {
			
			print(currentlyMap);
			System.out.println("Row: ");
			int row = scan.nextInt();
			System.out.println("Col: ");
			int col = scan.nextInt();
			
			if(row<0 || row>=rowNum) {
				
				System.out.println("Invalid coordinate.");
				continue;
			}
			
             if(col<0 || col>=colNum) {
				
				System.out.println("Invalid coordinate.");
				continue;
			}  
			
			if(map[row][col]!=-1) {  //girilen değerde mayın yoksa
				
				checkAround(row,col); 
				successChoice++;
				if(successChoice== size-(size/4)) {
					
					System.out.println("You won!");
					break;
				}
				
			}
			else {
				
				game=false;
				System.out.println("GAME OVER!");
			}
			
			
		}
		
	}
	
	public void checkAround(int row, int col) {
		
		if(map[row][col]==0) {
		if( (col<colNum-1) && (map[row][col+1]==-1)) {
			currentlyMap [row][col]++;
		}
		if((row<rowNum-1) && (map[row+1][col]==-1)) {
			currentlyMap [row][col]++;
		}
		if((row>0) && (map[row-1][col]==-1)) {
			currentlyMap [row][col]++;
		}
		if((col>0) && (map [row][col-1]==-1)) {
			currentlyMap [row][col]++;
		}
		
		if(currentlyMap[row][col]==0) {  //etrafında mayın yoksa -2 yazıyor
			
			currentlyMap[row][col]=-2; 
		}
		
		}
	}
	
	public void putMine() {
		
		int rndRow;
		int rndCol;
		int mineCount=0;
		
		while(mineCount != (size/4)) {
			
			rndRow = rnd.nextInt(rowNum);
			rndCol = rnd.nextInt(colNum);
			
			if(map[rndRow][rndCol] != -1) {  //mayın olan yerleri -1 ile döndürdüğümüz için  söylenen indekste mayın var mı yok mu diye kontrol ediyoruz
				
				map[rndRow][rndCol]=-1;
				mineCount++;
				
			} 
		}
		
		
	}
	
	public void print(int [][] arr) {
		
		for(int i=0; i<arr.length; i++) {
			
			for (int j=0; j<arr[0].length; j++) {
				
				if(arr[i][j]>=0) {        //0 ve -1 leri alt alta hizalayabilmek için 
					
				  System.out.print(" ");
				}
				System.out.print(arr[i][j]+" ");
			}
			
			System.out.println();
		}
		
		
	}

}
