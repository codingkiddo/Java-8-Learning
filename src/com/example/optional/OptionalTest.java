package com.example.optional;

import java.util.Optional;

public class OptionalTest {

	public static void main(String[] args) {

//		String name = null;
		String name = "Kumar";
//		Optional<String> nameOptional = Optional.of(name);
		Optional<String> nameOptional = Optional.ofNullable(name);
		System.out.println(nameOptional.isPresent());
		String newName = nameOptional.orElse("Vinod");
		System.out.println(newName);
		
		String s1 = new String();
		System.out.println("s1: " + s1);
		
//		Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
//			The target type of this expression must be a functional interface
//
//			at com.example.optional.OptionalTest.main(OptionalTest.java:20)
//
//		String s2 = String::new;
//		System.out.println("s2: " + s2);
		
	}

}
