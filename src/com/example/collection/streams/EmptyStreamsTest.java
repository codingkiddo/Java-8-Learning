package com.example.collection.streams;

import java.util.List;
import java.util.stream.Stream;

public class EmptyStreamsTest {

	public static void main(String[] args) {

		System.out.println(streamOf(null));
		
		Stream<String> stream = streamOf(null);
		stream.close();
		
	}

	public static Stream<String> streamOf(List<String> list) {
		return list == null || list.isEmpty() ? Stream.empty() : list.stream();
	}
}
