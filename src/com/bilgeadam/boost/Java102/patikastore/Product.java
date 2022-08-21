package com.bilgeadam.boost.Java102.patikastore;

public class Product {
	
	private int id;
	private double price;
	private double discount;
	private int stockAmount;
	private String name;
	private Brand brand;
	private static int count=0;
	
	public Product(double price, double discount, int stockAmount, String name, Brand brand) {
		
		this.id=++count;
		this.price=price;
		this.discount=discount;
		this.stockAmount=stockAmount;
		this.name=name;
		this.brand=brand;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getPrice() {
		return this.price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getDiscount() {
		return this.discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public int getStockAmount() {
		return this.stockAmount;
	}

	public void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Brand getBrand() {
		return this.brand;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
	}

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Product.count = count;
	}
	
	

}
