package com.example.thread;

public class ThreadMain {

	public static void main(String[] args) {

		Printer printer = new Printer();
		Worker worker = new Worker(printer);
		
		Thread t1 = new Thread(worker, "T1");
		Thread t2 = new Thread(worker, "T2");
		
		t1.start();
		t2.start();
	}

}
