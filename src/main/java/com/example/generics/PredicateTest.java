package com.example.generics;

import java.util.function.Predicate;
import java.util.stream.Stream;

public class PredicateTest {
	public static void main(String[] args) {
		// Creating predicate
		Predicate<Integer> lesserthan = i -> (i < 18);

		// Calling Predicate method
		System.out.println(lesserthan.test(10));
		
		Stream<Integer> stream;
	}
}
