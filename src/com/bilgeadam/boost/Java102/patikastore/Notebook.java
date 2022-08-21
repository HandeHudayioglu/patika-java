package com.bilgeadam.boost.Java102.patikastore;

public class Notebook extends Product {
	private int ram;
	private double screenSize;
	
	public Notebook(double price, double discount, int stockAmount, String name, Brand brand, int ram, 
			double screenSize) {
		super(price, discount, stockAmount, name, brand);
		this.ram = ram;
		this.screenSize = screenSize;
	}

	public int getRam() {
		return this.ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}


	public double getScreenSize() {
		return this.screenSize;
	}

	public void setScreenSize(double screenSize) {
		this.screenSize = screenSize;
	}
	
	
	
	

}
