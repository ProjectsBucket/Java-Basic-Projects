package com.java.string.programs;

import java.util.HashMap;
import java.util.Map;

public class OccurencesOfCharInAString {

	
	
	
	public static void main(String[] args) {
		String inputString = "dhjgfhfghsfgfhnvb";
		
		Map<String, Integer> charCount = new HashMap<>();
		
		//System.out.println(charCount.size());
		
		for (int i = 0; i<inputString.length() ; i++) {
			//System.out.println(inputString.charAt(i));
			String key = inputString.charAt(i)+"";
			
			if (charCount.containsKey(key)) {
				
				charCount.put(key, charCount.get(key)+1);
				
			} else {
				charCount.put(key, 1);
			}
		}
		
		System.out.println(charCount);
		
		
	}
}
