package com.example.collection.streams;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GroupByCount1 {

    public static void main(String[] args) {
    	
    	List<String> items =
                Arrays.asList("apple", "apple", "banana",
                        "apple", "orange", "banana", "papaya");

    	
    	
    	Map<String, Long> groupedMap = items.stream()
    			.collect(
    			Collectors.groupingBy(
    					Function.identity(), Collectors.counting()
    					)
    			);
    	
    	Map<String, Long> result = new LinkedHashMap<String, Long>();
    	groupedMap.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(obj -> result.put(obj.getKey(), obj.getValue()));
    	
    	System.out.println(groupedMap);
    	System.out.println(result);
    }
}
