package com.java.advanced;

import java.io.IOException;

public class JRuntime {

	public static void main(String[] args) throws IOException {

		int processorCount;
		
		Runtime rt = Runtime.getRuntime();
		processorCount = rt.availableProcessors(); // No of Cores
		
		System.out.println("No of Processor cores : " + processorCount);
		
		System.out.println("Total Memory : " + rt.totalMemory()/(1024*1024) + "MB");
		System.out.println("Free Memory : " + rt.freeMemory()/(1024*1024) + "MB");
		
		rt.exec("notepad"); // Runs an external program
		

	}

}
