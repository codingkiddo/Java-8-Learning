package com.example.thread;

public class Worker implements Runnable {

	private volatile Printer printer;
	
	public Worker(Printer printer) {
		this.printer = printer;
	}
	
	@Override
	public void run() {
		printer.print();
	}

}
