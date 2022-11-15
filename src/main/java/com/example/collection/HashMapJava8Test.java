package com.example.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class HashMapJava8Test {

	public static void main(String[] args) {

		Map<String, String> map = new HashMap<>();
		
		for( int i=0; i<1000000; i++) {
			int leftLimit = 97; // letter 'a'
			int rightLimit = 122; // letter 'z'
			int targetStringLength = 8;
			Random random = new Random();
			
			String generatedString = random.ints(leftLimit, rightLimit + 1).limit(targetStringLength)
					.collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();
			generatedString = generatedString + random.nextInt();
			map.put(generatedString, generatedString);
		}
		System.out.println(map);
	}

}
