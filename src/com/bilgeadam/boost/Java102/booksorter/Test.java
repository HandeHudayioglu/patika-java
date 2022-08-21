package com.bilgeadam.boost.Java102.booksorter;

import java.util.Comparator;
import java.util.TreeSet;

public class Test {

	public static void main(String[] args) {
		
		TreeSet<Book>book = new TreeSet<>();
		//Book b1 = new Book("Beyaz Zambaklar Ülkesinde",256,"Grigory Petrov",1923);
		Book b2 = new Book("Emma",516,"Jane Austen",1815);
		Book b3 = new Book("Vadideki Zambak",328,"Honore de Balzac",1835);
		Book b4  = new Book("Canlar Kimin İçin Çalıyor",636,"Ernest Hemingway",1940);
		//book.add(b1);
		book.add(b2);
		book.add(b3);
		book.add(b4);
		for (Book books : book) {
			System.out.println(books.toString());
		}
		System.out.println("*******************");
		TreeSet<Book>books = new TreeSet<>(new Comparator<Book>() {

			@Override
			public int compare(Book o1, Book o2) {
				return o1.getNumOfPage()-o2.getNumOfPage();
			}
		});
		
		//books.add(b1);
		books.add(b2);
		books.add(b3);
		books.add(b4);
		for (Book book2 : books) {
			System.out.println(book2.toString());
		}
		
		

	}

}
