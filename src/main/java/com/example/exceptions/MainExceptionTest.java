package com.example.exceptions;

public class MainExceptionTest {

	public static void main(String[] args) {
		System.out.println(getValue1());
	}

	private static int getValue0() {
		try {
			System.out.print("getValue0: ");
			return 0;
		} catch (Exception e) {
			System.out.println("Exception 0");
			return 0;
		}
	}
	
	private static int getValue1() {
		try {
			System.out.print("getValue1: ");
			throwException();
			return 1;
		} catch (Exception e) {
			System.out.println("Exception 1");
			return 11;
		} finally {
			System.out.println("finally 1");
			return 111;
		}
	}
	
	private static void throwException() throws Exception {
		throw new Exception();
	}
}
