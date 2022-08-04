package com.bilgeadam.boost.Java102.listclass;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		 MyList<Integer> list= new MyList<>();
		
		 System.out.println("List Status : " + (list.isEmpty() ? "Empty" : "Full"));
	        
		    list.add(10);
	        list.add(20);
	        list.add(30);
	        list.add(40);
	        list.add(20);
	        list.add(50);
	        list.add(60);
	        list.add(70);
	        
	       

	        System.out.println("List Status : " + (list.isEmpty() ? "Empty" : "Full"));
	        
	        System.out.println("Indeks : " + list.indexOf(20));  // 20 nin olduğu ilk indeksi verir
	        
	        System.out.println("Indeks :" + list.indexOf(100));  // Bulamazsa -1 döndürür
	        
	        System.out.println("Indeks : " + list.lastIndexOf(20)); // 20 nin olduğu son indeksi verir
	        
	        Object[] dizi = (Object[]) list.toArray();
	        System.out.println(dizi);
	       // System.out.println("First element of array object :" + dizi[0]);
	        
	        
	        MyList<Integer> mySubList = list.subList(0, 3);
	        System.out.println(mySubList.toString());
		 
			 
	

	}

}
