package com.example.util.function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class SupplierExample {

	public static void main(String[] args) {

		Supplier<Double> randomValue = () -> Math.random();
		System.out.println(randomValue.get());
		
		Supplier<List<Integer>> listSupplier = ArrayList::new;
		System.out.println(listSupplier.get());
		
		System.out.println(getSupplier().get().getClass());
		
		Supplier<List<Double>> doubleListSupplier = getSupplier();
		System.out.println(doubleListSupplier.get());
		
		
		doubleListSupplier.get().add(100.0);
		doubleListSupplier.get().add(200.0);
		
		System.out.println(doubleListSupplier.get());
		
		Supplier<List<Integer>> unKnownType = getSupplier();
		
	}

	private static <T> Supplier<List<T>> getSupplier() {
		Supplier<List<T>> supplier = ArrayList::new;
		return supplier;
	}
}
