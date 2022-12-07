package com.java8.features.functionalInterfaces;

import java.util.function.BiPredicate;

import com.java.features.lombok.Employee;

public class BiPredicateTest {
	
	public static int LIMIT = 18;
	
	static BiPredicate< Employee, Integer> biPredicate = (e, LIMIT) -> {
		
		if(e.getAge()>= LIMIT) {
			return true;
			
		} else {
			return  false;
		}
		
	};
	
	public static void checkEligibility(Employee e) {
		boolean flag = biPredicate.test(e, LIMIT);
		if(flag) {
			System.out.println("Candidate is eligible");
		} else {
			System.out.println("Candidate is not eligible");
		}
	}
	
	
	public static void main(String[] args) {
		Employee e = new Employee(1, "Puja", 12, "Java", 17);
		
		checkEligibility(e);
	}

}
