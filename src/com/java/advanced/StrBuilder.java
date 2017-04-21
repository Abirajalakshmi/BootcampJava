package com.java.advanced;

public class StrBuilder {
	
	public static void main(String[] args){
		
		StringBuilder sb = new StringBuilder(100);
		System.out.println(sb.capacity());
		sb= null;
		
		//Default Capacity
		
		StringBuilder sb1 = new StringBuilder();
		System.out.println(sb1.capacity());
		
		sb1.append("James ");
		sb1.append("007");
		System.out.println(sb1);
		sb1.insert(6, "Bond ");
		System.out.println(sb1);
		
		System.out.println(sb1.toString());
		
	}

}
