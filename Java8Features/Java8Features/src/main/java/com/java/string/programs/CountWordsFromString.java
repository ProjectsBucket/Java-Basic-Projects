package com.java.string.programs;

import java.util.Iterator;

public class CountWordsFromString {
	/**
	 * 2 ways
	 * 1. direct use length
	 * 2. iterate with if condition check char at i 
	 *    is a space and next char ie. i+1 is not a space
	 * 
	 */
	
	public static void main(String[] args) {
        String inputString = "java is best java is oop java is robust";
		
		String[] words = inputString.split(" ");
		
		//1. direct use length
		
		int numberOfWords = words.length;
		
		System.out.println(numberOfWords);
		int count = 1;
		
		for(int i = 0; i< inputString.length()-1; i++) {
			if((inputString.charAt(i) == ' ') && (inputString.charAt(i+1) != ' '))
            {
                count++;
            }
		}
		
		System.out.println(count);
		
	}

}
