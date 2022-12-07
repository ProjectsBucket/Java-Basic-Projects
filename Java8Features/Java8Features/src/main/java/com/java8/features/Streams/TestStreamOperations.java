package com.java8.features.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class TestStreamOperations {
	public static void main(String[] args) {
		List<Integer> number = Arrays.asList(2,3,4,5);
		
		number.stream().map(x -> x*x).collect(Collectors.toList());
        int even = number.stream().filter(x -> x%2 == 0).reduce(0,(ans,i)-> ans+i);
        
        System.out.println(even);
	}

}
