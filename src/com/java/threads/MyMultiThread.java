package com.java.threads;

public class MyMultiThread extends Thread{
	private String name;
	
	public MyMultiThread(String name) {
		this.name = name;
	}
	
	public void run(){
		
		System.out.println(name + " starts running");
		
		for(int i=0;i<5;i++)
		{
			System.out.println(i);
			
//			 try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
			System.out.println(name + " completed execution");
		}
		
	}
	
	public static void main(String[] args) {
		
		MyMultiThread th1 = new MyMultiThread("Thread1");
		MyMultiThread th2 = new MyMultiThread("Thread2");
		th1.start();
		th2.start();
		System.out.println(Thread.currentThread().getName()+" is executing");
	}

}
