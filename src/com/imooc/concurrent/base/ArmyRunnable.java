package com.imooc.concurrent.base;

//�����̡߳�ģ����ս˫������Ϊ
public class ArmyRunnable implements Runnable {
	//��֤�߳̿�����ȷ��ȡ�����̵߳�ֵ
	volatile boolean keepRunning = true;

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + "��ʼ��ս��");
		while(keepRunning) {
			for(int i=0;i<5;i++) {
				System.out.println(Thread.currentThread().getName() + "�����Է�["+i+"]");
				Thread.yield();
			}
		}
		System.out.println(Thread.currentThread().getName() + "������ս��");
	}

}
