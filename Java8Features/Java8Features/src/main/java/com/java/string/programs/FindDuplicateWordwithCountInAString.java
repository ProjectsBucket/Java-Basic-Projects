package com.java.string.programs;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicateWordwithCountInAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String inputString = "java is best java is oop java is robust";
		
		String[] words = inputString.split(" ");
		
		Map<String, Integer> wordscount = new HashMap<>();
		
		
		//System.out.println(words.length);
	
		for(String word: words) {
			
			if(wordscount.containsKey(word)) {
				wordscount.put(word, wordscount.get(word)+1);
			}else {
				wordscount.put(word, 1);
			}
		}

	}
	
	/**
	 * 1. split the string in word array
	 * 2. create the hashmap to store string and count
	 * 3. iterate the string array check if the key already present
	 * 4. if present increase the count by 1
	 * 5. else add the key with value as 1
	 */

}

