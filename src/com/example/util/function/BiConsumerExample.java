package com.example.util.function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample {

	public static void main(String[] args) {
		
		List<Integer> integers = new ArrayList<Integer>();
		
		BiConsumer<List<Integer>, Integer> consumer = List::add;
		consumer.accept(integers, 1);
		consumer.accept(integers, 2);
		consumer.accept(integers, 3);
		consumer.accept(integers, 4);
		consumer.accept(integers, 5);
		
		System.out.println(integers);
		
	}
}
