package com.example.util.function;

import java.util.function.Function;

public class SimpleFunctionInterface {

	public static void main(String[] args) {

		// Function which takes in a number
        // and returns half of it
//      Function<? super Integer, ? extends Number> half = a -> a / 2.0; // OK
		Function<? super Integer, ? extends Double> half = a -> a / 2.0; // OK
//		Function<? super Integer, ? extends Integer> half = a -> a / 2.0; // Type mismatch: cannot convert from double to Integer
        // Applying the function to get the result
        System.out.println(half.apply(10));
		
	}

}
