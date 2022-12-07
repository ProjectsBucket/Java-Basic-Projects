package com.java.array.programs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FindDuplicatesInAnArray {
	
	public static void main(String[] args) {
		
		int[] inputArray = {1, 2, 2, 3, 3, 4};
		int[] shuffledArray = {3,2,3,4,2,1};
		int[] bruteMethodArray = {3,2,3,4,2,1};
		int[] hashsetArray = {3,2,3,4,2,1};
		int[] streamArray = {3,2,3,4,2,1};
		
		// for sorted array
		
		for(int i = 0; i< inputArray.length-1; i++) {
			if(inputArray[i] == inputArray[i+1]) {
				System.out.println("Duplicate element found:"+ inputArray[i+1]);
			}
		}
		
		System.out.println();
		
		// 1. by sorting method
		
		Arrays.sort(shuffledArray);
		for(int i = 0; i< shuffledArray.length-1; i++) {
			if(shuffledArray[i] == shuffledArray[i+1]) {
				System.out.println("Sort:Duplicate element found:"+ shuffledArray[i+1]);
			}
		}
		System.out.println();
		
		//2.  by brute method/ using two for loops
		
		for(int i = 0; i< bruteMethodArray.length; i++) {
			for(int j = i+1; j < bruteMethodArray.length; j++) {
				if(bruteMethodArray[i] == bruteMethodArray[j]) {
					System.out.println("Brute:Duplicate element found:"+ bruteMethodArray[i+1]);
				}
			}
		}
		System.out.println();
		//3. by using HashSet
		
		Set<Integer> intSet = new HashSet<>();
		
		for(int i = 0; i< hashsetArray.length; i++) {
			if(!intSet.add(hashsetArray[i])) {
				System.out.println("HashSet:Duplicate element found:"+ hashsetArray[1]);
			}
		}
		
		//4. by using HashMap
		
	   Map<String, Integer> intMap = new HashMap<>();
	   
	   for(int i = 0; i< hashsetArray.length; i++) {
		   String key = hashsetArray[i]+"";
		   if(intMap.containsKey(key)) {
			   intMap.put(key, intMap.get(key)+1);
		   } else {
			   intMap.put(key, 1);
		   }
	   }
	   
	   System.out.println(intMap);
	   System.out.println();
	   
	   // using java8 streams
	   Set<Integer> uniqueSet = new HashSet<>();
	   
	   Set<Integer> duplicateElements = Arrays.stream(streamArray)
	         .filter(i-> !uniqueSet.add(i))
	         .boxed()
	         .collect(Collectors.toSet());
	   
	   System.out.println("Duplicate elements: "+duplicateElements);
	}

}
