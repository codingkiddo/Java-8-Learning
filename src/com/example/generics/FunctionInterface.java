package com.example.generics;

import java.util.HashMap;
import java.util.Map;

public class FunctionInterface {

	public static void main(String[] args) {

		Map<String, Integer> nameMap = new HashMap<>();
		nameMap.put("1", 100);
		System.out.println(nameMap);
		nameMap.computeIfAbsent("2", s -> s.length());
		System.out.println(nameMap);
		nameMap.computeIfPresent("2", (k, s) -> s+1);
		System.out.println(nameMap);
	}

}
