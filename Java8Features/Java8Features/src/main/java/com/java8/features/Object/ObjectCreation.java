package com.java8.features.Object;

import java.lang.reflect.Constructor;

import com.java.features.lombok.Employee;

public class ObjectCreation{
	
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, CloneNotSupportedException {
		// TODO Auto-generated method stub
		
		/* In java we can create object in following ways
		 * 1.Java new Operator
           2.Java Class.newInstance() method
           3.Java newInstance() method of constructor
           4.Java Object.clone() method
           5.Java Object Serialization and Deserialization
		 */
		
		// 1. using new operator
		Employee e = new Employee();
		
		
		// 2.Java Class.newInstance() method 
		
		Employee e1 = Employee.class.newInstance();
		
		// 3. Java newInstance() method of constructor
		
		Constructor<Employee> e2 = Employee.class.getConstructor();
		
		// 4.Java Object.clone() method
		ObjectCreation obc1 = new ObjectCreation();
		
		ObjectCreation obc3 = (ObjectCreation)obc1.clone();
		
		
		// 5.Java Object Serialization and Deserialization
		
		// check Deserialization.java class
		
		
		

	}
}
