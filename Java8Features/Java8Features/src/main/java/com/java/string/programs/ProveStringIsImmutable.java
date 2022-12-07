package com.java.string.programs;

public class ProveStringIsImmutable {
	
	public static void main(String[] args) {
		String inputString = "HelloJava";
		
		String updatedString = inputString+"HowAre you";
		
		System.out.println(inputString);
		System.out.println(updatedString);
			
	}

}
