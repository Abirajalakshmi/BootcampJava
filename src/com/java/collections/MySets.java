package com.java.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeSet;

public class MySets {

	public static void main(String[] args) {

		Set<Integer> mySet = new HashSet<>();
		boolean setaddnull = mySet.add(null);
		boolean setaddnull1=  mySet.add(null);
		
		System.out.println(setaddnull +" , "+ setaddnull1);
		System.out.println(mySet);
		
		mySet.add(100);
		mySet.add(new Integer(200));
		mySet.add(300);
		
		System.out.println("**********Hash Set*************");
		System.out.println(mySet);
		
		System.out.println("************Tree Set***********");
		mySet = new TreeSet<>();
//		mySet.add(null); 
		mySet.add(new Integer(200));
		mySet.add(100);
		System.out.println(mySet);
		
		System.out.println("************Linked Hash Set***********");
		mySet = new LinkedHashSet<>();
		mySet.add(null);
		mySet.add(new Integer(200));
		mySet.add(100);
		System.out.println(mySet);
		

	}

}
