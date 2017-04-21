package com.java.advanced;

import java.util.ArrayList;
import java.util.Collections;

@MyDocAnnotation(author="Abirajalakshmi", pubdate = "19Apr2017", reviewers = "Athi")
public class Book implements Comparable<Book>{
	
	private Long bookId; 
	private String title;
	private String genre;
	private float price; 
	
	
	public Book(Long bookId, String title, String genre, float price) {
	
		this.bookId = bookId;
		this.title = title;
		this.genre = genre;
		this.price = price;
	}


	@Override
	public int compareTo(Book b1) {
		if(this.price > b1.price)
			return 1;
		else if(this.price < b1.price)
			return -1;
		else 
			return 0;
	}

	public String toString(){
		
		StringBuilder sb = new StringBuilder(60);
		sb.append("Book Id:" + bookId);
		sb.append(", Title:" + title);
		sb.append(", Genre" + genre + "Price: "+ price);
		
		return sb.toString();
		
	}

	public static void main(String[] args){
		Book bk1 = new Book(2000L,"Visit Java", "Tourism", 250);
		Book bk2 = new Book(3000L,"Visit Java", "Tourism", 450);
		Book bk3 = new Book(1000L,"Visit Java", "Tourism", 100);
		
		System.out.println("********** Collections Operation ****************");
		
		ArrayList<Book> bookList = new ArrayList<>();
		bookList.add(bk1);
		bookList.add(bk2);
		bookList.add(bk3);
		
		System.out.println("********************Before Sorting *********************");
		
		for(Book bk : bookList){
			
			System.out.println(bk);
		}
		
		Collections.sort(bookList);
		
		System.out.println("********************Before Sorting *********************");
		
		for(Book bk : bookList){
			
			System.out.println(bk);
		}
		
	}
	
}
