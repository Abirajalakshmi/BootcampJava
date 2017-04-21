package com.java.streams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Read {

	public static void main(String[] args) throws IOException {
	
		FileOutputStream out = new FileOutputStream("IOlog.txt");
		for(int i=0;i<10;i++)
			out.write(i);
		
		out.close();
		
		FileInputStream in = new FileInputStream("IOlog.txt");
		
		int value;
		while( (value = in.read())!=-1) // To check End of file
			{
			System.out.println(value);
			}
		in.close();
		
	}

}
