package com.java8.features.defaultStaticMethodsInInterface;

public class Implementation implements InterfaceTest {

	@Override
	public boolean checkValue() {
		// TODO Auto-generated method stub
		return false;
	}

	static void checkString() {
		System.out.println("Static from implementation class");
	}

	public static void main(String[] args) {
		// Implementation.checkString();

		Implementation.checkString();

	}

}
