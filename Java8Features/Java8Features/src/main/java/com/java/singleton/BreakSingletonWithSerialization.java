package com.java.singleton;

public class BreakSingletonWithSerialization {
	
	public static void main(String[] args) {
		EagerInitializedSingleton singleton1 = EagerInitializedSingleton.getInstance();
		EagerInitializedSingleton singleton2 = null;
	}
	

}
