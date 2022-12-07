package com.java.string.programs;

public class ReverseString {
   /**
    * 1. using string buffer
    * 2. using iteration convert string in char array and iterate it reverse.
    * 3. using recursive method
    */
   
	static String INPUTSTRING = "hellojava";
	
	public static void main(String[] args) {
		reverseStringUsingSB();
		reverseString();
	}
	
	public static void reverseStringUsingSB() {
		StringBuffer sb = new StringBuffer(INPUTSTRING);
		System.out.println(sb.reverse());
	}
	
	public static void reverseString() {
		char[] strArray = INPUTSTRING.toCharArray();
		
		
		for(int i = strArray.length-1; i >= 0; i--) {
			System.out.print(strArray[i]);
		}
	}
}
