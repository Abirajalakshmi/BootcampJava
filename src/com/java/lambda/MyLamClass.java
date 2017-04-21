package com.java.lambda;

public class MyLamClass {
	
	public static void main(String[] args){
		
		//Anonymous Class which implements Runnable interface which in turn implements run() method
		Thread th = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i=0;i<5;i++)
				{
					System.out.println("Value is "+ i);
					try {
						Thread.sleep(50);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
			}
		});
		
		th.start();
		
		//Using Lambda expression
		
		Thread th1 = new Thread(
				()->{
			for(int i=0;i<5;i++)
			{
				System.out.println("Value is "+ i);
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		th1.start();
	}

}
