package com.java.string.programs;

public class ReverseEachWordInAString {
	
	public static void main(String[] args) {
		String inputString = "Hello How are you doing";
		
		String[] strArray = inputString.split(" ");
		
		String reverseString = "";
		
		for (int i = 0; i <= strArray.length -1; i++ ) {
			
			String reverseWord = "";
			String word = strArray[i];
			
			for(int j = word.length() - 1; j >= 0; j--) {
				reverseWord = reverseWord + word.charAt(j);
			}
			
		  reverseString = reverseString+reverseWord + " ";
		}
		
		System.out.println(reverseString);
	}

}
