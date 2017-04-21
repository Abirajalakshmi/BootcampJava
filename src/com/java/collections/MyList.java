package com.java.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MyList {

	public static void main(String[] args) {
		
		System.out.println("**********Array List***********");
		List<Integer> li = new ArrayList<>();
		li.add(null);
		li.add(100);
		li.add(new Integer(200));
		li.add(2, 900);
		li.add(100);
		System.out.println(li);
		
		System.out.println("**********Linked List***********");
		li = new LinkedList<>();
		li.add(null);
		li.add(100);
		li.add(new Integer(200));
		li.add(1, 400);
		li.add(100);
		System.out.println(li);
	}

}
