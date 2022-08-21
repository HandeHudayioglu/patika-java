package com.bilgeadam.boost.Java102.patikastore;

import java.util.Iterator;
import java.util.TreeSet;

public class BrandManager {
	
	private TreeSet<Brand> brands = new TreeSet<>();
	
	public BrandManager() {
		
		brands.add(new Brand("Samsung"));
		brands.add(new Brand("Lenovo"));
		brands.add(new Brand("Apple"));
		brands.add(new Brand("Huawei"));
		brands.add(new Brand("Casper"));
		brands.add(new Brand("Asus"));
		brands.add(new Brand("HP"));
		brands.add(new Brand("Xiaomi"));
		brands.add(new Brand("Monster"));
		
	}
	
	public void printBrands() {
		System.out.println("Brands: ");
		System.out.println();
		for (Brand brand : brands) {
			System.out.println(brand.getBrandName()+" ,");
		}
	}
	
	public void add(Brand brand) {
		this.brands.add(brand);
	}
	
	public Brand getBrand(String brandName) {
		
		Iterator<Brand>itr = brands.iterator();
		Brand currentBrand;
		while(itr.hasNext()) {
			currentBrand=itr.next();
			if(currentBrand.getBrandName().equalsIgnoreCase(brandName)) {
				return currentBrand;
			}
		}
		return null;
	}

}