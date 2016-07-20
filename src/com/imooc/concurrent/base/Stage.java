package com.imooc.concurrent.base;

public class Stage extends Thread {
	
	public void run() {
		
		System.out.println("欢迎观看隋唐演义");
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		
		System.out.println("大幕徐徐拉开。。。");
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		
		System.out.println("话说隋朝末年，隋军与农民军杀的天昏地暗。。。");
		
		ArmyRunnable armyTaskOfSuiDynasty = new ArmyRunnable();
		ArmyRunnable armyTaskOfRevolt = new ArmyRunnable();
		
		Thread armyOfSuiDynasty = new Thread(armyTaskOfSuiDynasty, "隋军");
		Thread armyOfRevolt = new Thread(armyTaskOfRevolt, "农民军");
		
		armyOfSuiDynasty.start();
		armyOfRevolt.start();
		
		try {
			Thread.sleep(50);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("正当双方厮杀正酣，半路杀出个程咬金。。。");
		
		Thread mrCheng = new KeyPerson();
		mrCheng.setName("程咬金");
		
		System.out.println("程咬金的理想是百姓安居乐业");
				
		armyTaskOfSuiDynasty.keepRunning = false;
		armyTaskOfRevolt.keepRunning = false;
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		mrCheng.start();
				
		try {
			mrCheng.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("战争结束。程咬金实现理想");
		System.out.println("谢谢观看，再见！");
		
	}

	public static void main(String[] args) {
		new Stage().start();

	}

}
