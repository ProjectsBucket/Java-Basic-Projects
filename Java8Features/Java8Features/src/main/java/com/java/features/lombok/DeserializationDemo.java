package com.java.features.lombok;

import java.io.FileOutputStream;

public class DeserializationDemo {
	
	
	public static void main(String[] args) {
		Employee employee = new Employee(1, "Puja", 11, "Java", 21);
		String filename = "Demofile.ser";
		
		try {
			FileOutputStream fo = new FileOutputStream(filename);
			
			
		} catch (Exception e ) {
			
		}
		
	}
	
	
	

}
