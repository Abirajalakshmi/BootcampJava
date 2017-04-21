package com.java.threads;

import java.util.concurrent.Callable;

public class CallableNews implements Callable<Integer>{

	@Override
	public Integer call() throws Exception {
		for(int i=0;i<5;i++)
		{
			Thread.sleep(500);
			System.out.println("You have "+ (500+i*10) + " shares of APPLE");
		}
		return 500;
	}

}
