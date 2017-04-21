package com.java.advanced;

import java.lang.annotation.Annotation;

public class ClassDeclarationSummary {

	public static void main(String[] args) {
		try {
			Class<?> cls = Class.forName("com.java.advanced.Book");
			
			java.lang.annotation.Annotation[] ans = cls.getAnnotations();
			
			if(ans.length!=0)
			{
				for(Annotation an : ans)
				{
					System.out.println(an.toString());
				}
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
