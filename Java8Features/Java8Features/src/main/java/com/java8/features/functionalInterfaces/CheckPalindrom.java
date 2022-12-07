package com.java8.features.functionalInterfaces;

import java.util.function.Predicate;

public class CheckPalindrom {
	
	static Predicate<String> predicate = str -> {

		char[] chars = str.toCharArray();
		String newStr = "";
		
		for(int i = chars.length-1; i >= 0; i--) {
			newStr += chars[i];
		}
		
		if(str.equalsIgnoreCase(newStr)) {
			return true; 
		} else
			return false;
	};
	
	
	public static void checkPalindrom(String s) {
		boolean flag = predicate.test(s);
		if(flag) {
			System.out.println("Its palindrom");
		}else {
			System.out.println("Its not palindrom");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		checkPalindrom("madam");
		checkPalindrom("summer");
		checkPalindrom("heyu");
		checkPalindrom("sadas");
      
	}

}
