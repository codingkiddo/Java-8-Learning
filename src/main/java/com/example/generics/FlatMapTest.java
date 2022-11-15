package com.example.generics;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FlatMapTest {

	public static void main(String[] args) {

		// Creating a List of Strings 
        List<String> list = Arrays.asList("5.6", "7.4", "4", "1", "2.3");
        list.stream().map(n->n).forEach(System.out::println);
        
        System.out.println("===============");
        
        Stream<Integer> intStream = Stream.of(100);
        System.out.println(intStream.count());
		
//        list.stream().flatMap(n->n).forEach(System.out::println);
        list.stream().flatMap(n->Stream.of(n)).forEach(System.out::println);
	}

}
