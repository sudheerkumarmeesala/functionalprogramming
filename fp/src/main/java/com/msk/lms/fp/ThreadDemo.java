package com.msk.lms.fp;

public class ThreadDemo {

	public static void main(String[] args) {

		Thread t = new Thread(new Runnable() {
			
			public void run() {
				System.out.println(
						"Hello world in another thread");
			}
			
		});

		t.start();

		System.out.println("Hello world in main thread");
	}

}
