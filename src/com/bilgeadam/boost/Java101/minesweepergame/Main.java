package com.bilgeadam.boost.Java101.minesweepergame;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Welcome to minesweeper game!");
		System.out.println("Please enter the dimensions you want to play. ");
		System.out.println("Number of rows: ");
		int rowNum = scan.nextInt();
		System.out.println("Number of columns: ");
		int colNum = scan.nextInt();
		
		MinesweeperGame mine = new MinesweeperGame(rowNum,colNum);
		mine.run();

		
	}

}
