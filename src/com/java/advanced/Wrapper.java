package com.java.advanced;

import java.util.ArrayList;
import java.util.List;

public class Wrapper {

	public static void main(String[] args){
		
		Integer a1;
		a1=5;       //Auto boxing Assigning primitive to wrapper class
		a1++;		//Auto Unboxing and boxing
		
		System.out.println("Value of a1 is "+ a1);
		
		List<Integer> arrList = new ArrayList<Integer>();
		arrList.add(100); //Autoboxing
		arrList.add(500);
		
		for(int i =0;i<arrList.size();i++)
			System.out.println(arrList.get(i));
			
		int sum = arrList.get(0)+ arrList.get(1);
		System.out.println("Sum is : " + sum);
		
		Boolean b = false;
		System.out.println(b);
	}
	
}
