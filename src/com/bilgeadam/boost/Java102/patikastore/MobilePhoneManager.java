package com.bilgeadam.boost.Java102.patikastore;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MobilePhoneManager implements ProductService {
	private List<MobilePhone> mobilePhones;
	
	public MobilePhoneManager() {
		this.mobilePhones=new ArrayList<>();
		this.mobilePhones.add(new MobilePhone(3199,0,128,"SAMSUNG GALAXY A51",new Brand("Samsung"),6.5,4000,6, 32, "Siyah"));
		this.mobilePhones.add(new MobilePhone(7379,0,412,"iPhone 11 64 GB",new Brand("Apple"),6.1,3046,6, 5, "Mavi"));
        this.mobilePhones.add(new MobilePhone(4012,0,412,"Redmi Note 10 Pro 8GB",new Brand("Xiaomi"),6.5,4000,12, 35, "Beyaz"));
       
	}

	@Override
	public void listAll() {
		System.out.println("Mobile Phones: ");
		System.out.println();
		String leftAlignFormat = "| %-2d | %-25s | %-11s | %-9s | %-10d | %-9s | %-9s | %-9s | %-5d | %-8s |%n";
        System.out.format("--------------------------------------------------------------------------------------------------------------------------------%n");
        System.out.format("| ID | Product Name                  | Price       | Brand     | Stock   | Camera    | Screen Size     | Battery       | RAM   | Color     |%n");
        System.out.format("--------------------------------------------------------------------------------------------------------------------------------%n");
        for (MobilePhone mb : mobilePhones) {
        	System.out.format(leftAlignFormat, mb.getId(), mb.getName(),mb.getPrice()+" TL",mb.getBrand().getBrandName(),mb.getStockAmount(),mb.getCamera(),mb.getScreenSize(),mb.getBattery(),mb.getRam(),mb.getColor());
		}
        System.out.format("--------------------------------------------------------------------------------------------------------------------------------%n");
	}

	@Override
	public boolean delete(int id) {
		return this.mobilePhones.removeIf(mb -> mb.getId()==id);
	}

	@Override
	public boolean add(Product product) {
		return this.mobilePhones.add((MobilePhone) product);
	}

	@Override
	public void listByBrand(String brandName) {
		 String leftAlignFormat = "| %-2d | %-25s | %-11s | %-9s | %-10d | %-9s | %-9s | %-9s | %-5d | %-8s |%n";
	     System.out.format("--------------------------------------------------------------------------------------------------------------------------------%n");
	     System.out.format("| ID | Product Name                  | Price       | Brand     | Stock   | Camera    | Screen Size     | Battery       | RAM   | Color     |%n");
	     System.out.format("--------------------------------------------------------------------------------------------------------------------------------%n");
	     List<MobilePhone> phones = this.mobilePhones.stream().filter(mb -> mb.getBrand().getBrandName().equalsIgnoreCase(brandName)).collect(Collectors.toList());
	     for (MobilePhone mb : phones) {
	    	 System.out.format(leftAlignFormat, mb.getId(), mb.getName(),mb.getPrice()+" TL",mb.getBrand().getBrandName(),mb.getCamera(),mb.getScreenSize(),mb.getBattery(),mb.getRam(),mb.getColor());
		}
	     System.out.format("--------------------------------------------------------------------------------------------------------------------------------%n");
	     System.out.println();
	}
	
	

}
