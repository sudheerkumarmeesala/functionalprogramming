package com.msk.lms.fp;

public class HOFunctionDemo {

	public static void main(String[] args) {
		// function as first-class citizen; functional interfaces
		
		Thread t = new Thread(() -> System.out.println(
				"Hello world in another thread"));

		t.start();

		System.out.println("Hello world in main thread");
	}

}
