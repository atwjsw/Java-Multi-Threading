package com.atwjsw.thread.initial;

public class Actress implements Runnable {
	
	public void run() {
		System.out.println(Thread.currentThread().getName()+"是一个演员");
		int count = 0;
		boolean keepRunning = true;
		
		while (keepRunning) {
			System.out.println(Thread.currentThread().getName() +"登台演出:" + ++count);
				
			if(count == 100) {
				keepRunning =  false;
			}
			
			if(count%10 == 0) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		System.out.println(Thread.currentThread().getName()+"结束表演");
	}

}
