package com.example.generics;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CountDistinctWords {

	public static void main(String[] args) throws FileNotFoundException, IOException {

		BufferedReader bufferedReader = Files.newBufferedReader(
				Paths.get("data/notes.txt"));
		Stream<String> lines = bufferedReader.lines();
		lines.forEach(System.out::println);

		BufferedReader reader = new BufferedReader(new FileReader(
				new File("data/notes.txt")));
		Map<String, Integer> wordsMap = new HashMap<>();
		String line = reader.readLine();
		while (line != null) {
			String[] words = line.split(" ");
			for (String s : words) {
				if (wordsMap.containsKey(s)) {
					wordsMap.put(s, wordsMap.get(s) + 1);
				} else {
					wordsMap.put(s, 1);
				}
			}
			line = reader.readLine();
		}
		System.out.println(wordsMap);
		reader.close();

		System.out.println("===================");
		
		System.out.println(Files
		.lines(Paths.get(
				"data/notes.txt")).map(s -> s.split(" "))
		.flatMap(Arrays::stream).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())));
		
		System.out.println("===================");
		
		
		Map<String,Long> collect  = Files
		.lines(Paths.get(
				"data/notes.txt")).map(s -> s.split(" "))
		.flatMap(Arrays::stream).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		collect.put(null, 100L);
		System.out.println(collect);
		collect.remove("Java");
		System.out.println(collect);
		System.out.println(collect.get(null));
		
		System.out.println(Files
				.lines(Paths.get(
						"data/notes.txt"))
				.map(s -> s.split(" ")).flatMap(Arrays::stream).count());

		List<Integer> list = Arrays.asList(3, 2, 12, 5, 6, 11, 13);
		System.out.println(list.stream().filter(n -> n % 2 == 0).count());
		System.out.println(list.stream().filter(n -> n % 2 == 0).map(n -> n * n).filter(n -> n % 2 == 0).count());
		System.out.println(list.stream().filter(n -> n % 2 == 0).collect(Collectors.toList()));
		list.stream().filter(n -> n % 2 == 0).forEach(System.out::println);

		System.out.println(list.stream().filter(n -> n % 2 == 0).mapToInt(Integer::intValue).sum());
		System.out.println(list.stream().filter(n -> n % 2 == 0).reduce(0, (e1, e2) -> e1 + e2));

		// Implementation of reduce method
		// to get the longest String
		// creating a list of Strings
		List<String> words = Arrays.asList("GFG", "Geeks", "for", "GeeksQuiz", "GeeksforGeeks");
		// The lambda expression passed to
		// reduce() method takes two Strings
		// and returns the longer String.
		// The result of the reduce() method is
		// an Optional because the list on which
		// reduce() is called may be empty.

		Optional<String> longestString = words.stream().reduce((w1, w2) -> w1.length() > w2.length() ? w1 : w2);
//        System.out.println(longestString);
		longestString.ifPresent(System.out::println);

		// Implementation of reduce method
		// to get the combined String
		// String array
		String[] array = { "Geeks", "for", "Geeks" };

		Optional<String> combiedString = Arrays.stream(array).reduce((w1, w2) -> w1 + " - " + w2);
		// Displaying the combined String
		if (combiedString.isPresent()) {
			System.out.println(combiedString.get());
		}

		// Implementation of reduce method
		// to get the product of all numbers
		// in given range.
		
		// To get the product of all elements 
        // in given range excluding the 
        // rightmost element 
		System.out.println(IntStream.range(2, 4).count());
		System.out.println(IntStream.range(2, 4).reduce( (n1,n2)->(n1*n2)).orElse(-1));
		
		
		
		
	}

}
