package com.example.generics;

public class AmbiguityTest {

	public static void main(String[] args) {

		message(null);
		message("Vinod");
	}

	private static void message(Object object) {
		System.out.println(object);
	}
	
	private static void message(String str) {
		System.out.println("message(String str)" + str);
	}

}
