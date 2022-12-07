import org.springframework.expression.spel.ast.MethodReference;

import com.java8.features.defaultStaticMethodsInInterface.InterfaceTest;

public class TestMethodReff {
	
	public static void main(String[] args) {
		
	}
	
	public static void method1(){
		//InterfaceTest val = TestMethodReff::getStatement;
	}
	
    public static void getStatement(String[] args) {
		System.out.println("This is my statement");
	}
	
	
	
	
	 public static void saySomething(){  
	        System.out.println("Hello, this is static method.");  
	    }  
	    public static void some(String[] args) {  
	        // Referring static method  
	     //   InterfaceTest sayable = TestMethodReff::saySomething;  
	        // Calling interface method  
	       // sayable.checkValue();  
	    }  

}
