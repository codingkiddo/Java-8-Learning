package com.example.collection.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerTest {

	// static function to be called
	static void someFunction(String s) {
		System.out.println(s);
	}

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("Geeks");
		list.add("For");
		list.add("GEEKS");

		// call the static method
		// using double colon operator
		list.forEach(ConsumerTest::someFunction);
		
		Consumer<String> consumer = ConsumerTest::someFunction;
		
		System.out.println(consumer);
		consumer.accept("Hi");
	}

}
