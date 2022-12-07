package com.java.string.programs;

public class ReverseWordsInStringSentence {
	
	public static void main(String[] args) {
		String inputString = "Hello How are you doing";
		
		String[] strArray = inputString.split(" ");
		
		String reverseString = "";
		
		for(int i = strArray.length - 1; i >= 0; i--) {
			reverseString = reverseString + strArray[i];
			
			if (i != 0 && i != strArray.length) {
				reverseString = reverseString + " ";
			}
			
		}
		
		System.out.println(reverseString);
	}

}
