package com.java.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class BreakSingletonWithReflection {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		EagerInitializedSingleton singleton1 = EagerInitializedSingleton.getInstance();
		EagerInitializedSingleton singleton2 = null;
		
		
		
		// Break using reflection API
		Constructor<EagerInitializedSingleton>[] constructors = 
				(Constructor<EagerInitializedSingleton>[]) EagerInitializedSingleton.class.getDeclaredConstructors();
		
		for(Constructor<EagerInitializedSingleton> constructor: constructors) {
			constructor.setAccessible(true);
			singleton2 = constructor.newInstance();
			break;
		}
		
		System.err.println(singleton1);
		System.err.println(singleton2);
		
		// we can avoid reflection api to break our singleton if we declare singleton as Enum
		    Singleton singletonen1 = Singleton.INSTANCE;
		    Singleton singletonen2 = null;
		    
		 // Break using reflection API
			Constructor<Singleton>[] singletonConstrs = 
					(Constructor<Singleton>[]) Singleton.class.getDeclaredConstructors();
			
			for(Constructor<Singleton> singletonConstr: singletonConstrs) {
				singletonConstr.setAccessible(true);
				// below line will throw error that  Cannot reflectively create enum objects thats y commenting 
				//singletonen2 = singletonConstr.newInstance();
				break;
			}
		        System.out.println();
				System.out.println(singletonen1);
				System.out.println(singletonen1);
		
	}
}
