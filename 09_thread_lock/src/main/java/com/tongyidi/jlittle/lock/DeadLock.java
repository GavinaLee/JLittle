package com.tongyidi.jlittle.lock;

public class DeadLock implements Runnable {
	boolean flag;

	public int age;
	
	protected int aa;
	
	public DeadLock(boolean flag) {
		this.flag = flag;
	}

	static Object o1 = new Object(), o2 = new Object();

	@Override
	public void run() {
		if (flag) {
			synchronized (o1) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				synchronized (o2) {
					System.out.println("true");
				}
			}
		} else {
			synchronized (o2) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				synchronized (o1) {
					System.out.println("false");
				}
			}
		}

	}

}


