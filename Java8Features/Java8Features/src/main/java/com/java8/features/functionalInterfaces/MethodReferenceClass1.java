package com.java8.features.functionalInterfaces;

public class MethodReferenceClass1 {

	static int addtwoNumbers(int a, int b) {
		return a+b;
	}
	
	public void printString(String s) {
		System.out.println(s);
	}
	
	// Functional interface implementation using anonymous class
	MethodReferenceInterface2 methodReferenceInterface2 = (s)->{
		System.out.print(s);
	};
	
	
	public static void main(String[] args) {
		MethodReferenceInterface1 mIntf1 = MethodReferenceClass1::addtwoNumbers;
		System.out.println(mIntf1.summation(1, 2));
		
		// implementing functional interface using method reference
		MethodReferenceInterface2 mri = new MethodReferenceClass1()::printString;
		mri.printString("Puja");
		
		// implementing functional interface using lambda exp
		MethodReferenceInterface2 mri2 = (s)->{
			System.out.println(s);
		};
		
		mri2.printString("puja");
		
	}
}
