package com.bilgeadam.boost.Java102.patikastore;

public class MobilePhone extends Product {
	
	private double screenSize;
	private double battery;
	private int ram;
	private int camera;
	private String color;
	
	
	public MobilePhone(double price, double discount, int stockAmount, String name, Brand brand,
			double screenSize, double battery, int ram, int camera, String color) {
		super(price, discount, stockAmount, name, brand);
		this.screenSize = screenSize;
		this.battery = battery;
		this.ram = ram;
		this.camera = camera;
		this.color = color;
	}


	public double getScreenSize() {
		return this.screenSize;
	}


	public void setScreenSize(double screenSize) {
		this.screenSize = screenSize;
	}


	public double getBattery() {
		return this.battery;
	}


	public void setBattery(double battery) {
		this.battery = battery;
	}


	public int getRam() {
		return this.ram;
	}


	public void setRam(int ram) {
		this.ram = ram;
	}


	public int getCamera() {
		return this.camera;
	}


	public void setCamera(int camera) {
		this.camera = camera;
	}


	public String getColor() {
		return this.color;
	}


	public void setColor(String color) {
		this.color = color;
	}
	
	
	
	
	
	
	
	

}
