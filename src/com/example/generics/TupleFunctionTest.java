package com.example.generics;

interface TupleFunction<T, U> {

	public <O> O[] getTuple(T t, U u);
	
}


class TupleFunctionClass implements TupleFunction<String, Double> {

	@Override
	public  Object[] getTuple(String t, Double u) {
		Object[] array = new Object[2];
		array[0] = t;
		array[1] = u;
		return array;
	}

	
	
}

public class TupleFunctionTest {
	public static void main(String[] args) {
		
		TupleFunctionClass obj = new TupleFunctionClass();
		System.out.println(obj.getTuple("One", 1.0)[0]);
		
	}
}