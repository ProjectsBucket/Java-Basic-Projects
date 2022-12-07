package com.java8.features.functionalInterfaces;

public class LambdaExpressionTest {
	
	
	public static void main(String[] args) {
		MethodReferenceInterface1 mrf = (a, b)-> {
			return a+b;
		};
		
		System.out.println(mrf.summation(12, 20));
	}

}
