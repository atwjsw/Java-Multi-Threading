package com.atwjsw.thread.initial;

public class Actor extends Thread {
	public void run() {
		System.out.println(getName()+"��һ����Ա");
		int count = 0;
		boolean keepRunning = true;
		
		while (keepRunning) {
			System.out.println(getName()+"��̨�ݳ�:" + ++count);
						
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
		System.out.println(getName()+"��������");
	}
	
	public static void main(String[] arg) {
		Thread actor = new Actor();
		actor.setName("Mr. Thread");
		actor.start();
		
		Thread actress = new Thread(new Actress(), "Ms. Runnable");
		actress.start();
	}
}
