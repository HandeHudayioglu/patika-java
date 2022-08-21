package com.bilgeadam.boost.Java102.patikastore;

public interface ProductService {
	
	public void listAll();
	boolean delete(int id);
	boolean add(Product product);
	public void listByBrand(String brandName);

}
