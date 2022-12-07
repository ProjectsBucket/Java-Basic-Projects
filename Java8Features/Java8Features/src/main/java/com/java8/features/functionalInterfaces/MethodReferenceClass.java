package com.java8.features.functionalInterfaces;

public class MethodReferenceClass {
	
	
	public static boolean addTwoNumbers() {
		return true;
	}
	
	
	public static void main(String[] args) {
		MethodReferenceInterface fInt = MethodReferenceClass::addTwoNumbers;
		
		System.out.println(fInt.summation());
	}

}
