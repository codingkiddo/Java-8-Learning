package com.example.thread;

public class Printer {

	private volatile int n=0;
	
	public void print() {
		for ( n=0; n<5; n++ ) {
			System.out.println("Thread: " + Thread.currentThread().getName() + " - " + n);
		}
	}
	
}
