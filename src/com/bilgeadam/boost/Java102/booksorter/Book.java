package com.bilgeadam.boost.Java102.booksorter;

public class Book implements Comparable<Book>{
	
	private String name;
	private int numOfPage;
	private String author;
	private int date;
	
	public Book(String name, int numOfPage, String author, int date) {
		super();
		this.name = name;
		this.numOfPage = numOfPage;
		this.author = author;
		this.date = date;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumOfPage() {
		return this.numOfPage;
	}

	public void setNumOfPage(int numOfPage) {
		this.numOfPage = numOfPage;
	}

	public String getAuthor() {
		return this.author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getDate() {
		return this.date;
	}

	public void setDate(int date) {
		this.date = date;
	}

	@Override
	public int compareTo(Book o) {
		return getName().compareTo(o.getName());
	}

	@Override
	public String toString() {
		return "Book [name=" + this.name + ", numOfPage=" + this.numOfPage + ", author=" + this.author + ", date="
				+ this.date + "]";
	}
	
	

}
