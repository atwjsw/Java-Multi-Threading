package com.imooc.concurrent.base;

//军队线程。模拟作战双方的行为
public class ArmyRunnable implements Runnable {
	//保证线程可以正确读取其他线程的值
	volatile boolean keepRunning = true;

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + "开始了战斗");
		while(keepRunning) {
			for(int i=0;i<5;i++) {
				System.out.println(Thread.currentThread().getName() + "攻击对方["+i+"]");
				Thread.yield();
			}
		}
		System.out.println(Thread.currentThread().getName() + "结束了战斗");
	}

}
