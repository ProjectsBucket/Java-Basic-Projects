package com.java.string.programs;

public class RemoveWhiteSpacesFromString {
	
	/** 3 ways
	 * 1. using predefined methods replace
	 * 2. using predefined methods replaceAll
	 * 3. using iteration
	 * 
	 *
	 */
	
	public static void main(String[] args) {
		String s = "Hey you how are you!";
		
		String noSpacesString = s.trim().replace(" ", "");
		
		String noSpaceString1 = s.trim().replaceAll(" ", "");
		
		System.out.println(noSpacesString);
		System.out.println(noSpaceString1);
		
		String[] strArray = s.split(" ");
		
		String stringWithoutSpaces = "";
		
		for (int i = 0; i< strArray.length; i++) {
			stringWithoutSpaces = stringWithoutSpaces+strArray[i];
		}
		
		System.out.println(stringWithoutSpaces);
	}

}
