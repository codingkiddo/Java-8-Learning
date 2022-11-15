package com.example.generics;

import java.util.HashMap;
import java.util.Map;

public class MapIterateTest {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();

		map.put(1, "ONE");
		map.put(2, "TWO");
		map.put(3, "THREE");
		map.put(4, "FOUR");

		map.keySet().stream().forEach(e -> System.out.println(e));
		;
	}

}
