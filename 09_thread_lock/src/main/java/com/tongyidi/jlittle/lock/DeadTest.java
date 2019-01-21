package com.tongyidi.jlittle.lock;

public class DeadTest {

	public static void main(String[] args) {
		DeadLock d1 = new DeadLock(true);
		DeadLock d2 = new DeadLock(false);

		Thread t1 = new Thread(d1);
		Thread t2 = new Thread(d2);

		t1.start();
		t2.start();
	}

}
