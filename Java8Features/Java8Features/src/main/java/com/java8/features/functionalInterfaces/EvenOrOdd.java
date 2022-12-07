package com.java8.features.functionalInterfaces;

import java.util.function.Predicate;

public class EvenOrOdd {

	 static Predicate<Integer> predicate = t -> {
		if(t%2 == 0) {
			return true;
		} else {
			return false;
		}
	};
	
	public static String checkNumberEvenOrOdd(Integer intr) {
		boolean flag = predicate.test(intr);
		if(flag)
			return "Number is even";
		else
			return "Number is odd";
	}
	
	public static void main(String[] args) {
		System.out.println(checkNumberEvenOrOdd(12));
		System.out.println(checkNumberEvenOrOdd(11));
	}
}
