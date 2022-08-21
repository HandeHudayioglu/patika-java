package com.bilgeadam.boost.Java102.patikastore;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class Brand implements Comparable<Brand>{
	
	private int id;
	private String brandName;
	private static int count=0;
	
	public Brand(String brandName) {
		this.id=++count;
		this.brandName=brandName;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBrandName() {
		return this.brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Brand.count = count;
	}

	@Override
	public int compareTo(Brand o) {
		// TODO Auto-generated method stub
		return this.getBrandName().compareTo(o.getBrandName());
	}

	
	
	
	
	
}
