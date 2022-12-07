package com.java8.features.defaultStaticMethodsInInterface;

public interface InterfaceTest {
    boolean checkValue();
	
   // normal method not allowed
   //	boolean checkInt() {
   //		return true;
   //	}
	
	static void checkString() {
		System.out.println("Static from interface");
	}
	
    default void checkString1() {
    	System.out.println("default from interface");
	}
	
	// normal method not allowed
//    public void checkString1() {
//		
//	}
    
//    protected static void checkString2() {
//		
//   	}
//    
//    private static void checkString3() {
//		
//   	}
}
