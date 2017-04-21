package com.java.threads;

public class MySingleThread extends Thread{
	
	private String name,msg;

	public MySingleThread(String name, String msg) {
		
		this.name = name;
		this.msg = msg;
	}
	

	@Override
	public void run() {
		System.out.println(name + " starts running with message : " + msg);
		System.out.println(Thread.currentThread().getName());
		
		for(int i=0;i<5;i++)
		{
			System.out.println(i);
			
			 try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(name + " completed execution");
		}
	}

	public static void main(String[] args){
		MySingleThread mth = new MySingleThread("Thread1", "First thread is running");
		mth.start();
		 System.out.println(Thread.currentThread().getName() + " is executing");
		
	} 
	
}
