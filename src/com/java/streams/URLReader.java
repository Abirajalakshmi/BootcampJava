package com.java.streams;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

public class URLReader {

	public static void main(String[] args) throws IOException {
	
		URL url = new URL("http://indianexpress.com/");
		URLConnection con = url.openConnection();
		InputStreamReader reader = new InputStreamReader(con.getInputStream());
		BufferedReader brReader = new BufferedReader(reader);
		
		System.out.println("Hello");
		
		// Reading Headers
		
		URLConnection con1 = url.openConnection();
		Map<String,List<String>>headerMap = con1.getHeaderFields();

	}

}
