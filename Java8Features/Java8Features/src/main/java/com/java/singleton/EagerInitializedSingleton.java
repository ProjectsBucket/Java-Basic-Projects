package com.java.singleton;

public class EagerInitializedSingleton {
	private static EagerInitializedSingleton INSTANCE = new EagerInitializedSingleton();
	
	private EagerInitializedSingleton () {
	    System.console();
		System.out.println("Object initialised.");
	}
	
	public static EagerInitializedSingleton getInstance() {
	
		return INSTANCE;
	}

}
