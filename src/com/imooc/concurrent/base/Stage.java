package com.imooc.concurrent.base;

public class Stage extends Thread {
	
	public void run() {
		
		System.out.println("��ӭ�ۿ���������");
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		
		System.out.println("��Ļ��������������");
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		
		System.out.println("��˵�峯ĩ�꣬�����ũ���ɱ�����ذ�������");
		
		ArmyRunnable armyTaskOfSuiDynasty = new ArmyRunnable();
		ArmyRunnable armyTaskOfRevolt = new ArmyRunnable();
		
		Thread armyOfSuiDynasty = new Thread(armyTaskOfSuiDynasty, "���");
		Thread armyOfRevolt = new Thread(armyTaskOfRevolt, "ũ���");
		
		armyOfSuiDynasty.start();
		armyOfRevolt.start();
		
		try {
			Thread.sleep(50);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("����˫����ɱ��������·ɱ������ҧ�𡣡���");
		
		Thread mrCheng = new KeyPerson();
		mrCheng.setName("��ҧ��");
		
		System.out.println("��ҧ��������ǰ��հ�����ҵ");
				
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
		
		System.out.println("ս����������ҧ��ʵ������");
		System.out.println("лл�ۿ����ټ���");
		
	}

	public static void main(String[] args) {
		new Stage().start();

	}

}
