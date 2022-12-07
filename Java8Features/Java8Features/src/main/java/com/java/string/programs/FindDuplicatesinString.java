package com.java.string.programs;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicatesinString {
	
	public static void main(String[] args) {
		String inputString = "Hey there are there duplicate chara in the string";
		
		//String 
		
		Map<String, Integer> stringCount = new HashMap<>();
		
		for(int i = 0; i < inputString.length(); i++) {
			String key = inputString.charAt(i)+"";
			if(stringCount.containsKey(key)) {
				stringCount.put(key, stringCount.get(key)+1);
				
			} else {
				stringCount.put(key, 1);
			}
			
		}
		
		System.out.println(stringCount);
	}

}
