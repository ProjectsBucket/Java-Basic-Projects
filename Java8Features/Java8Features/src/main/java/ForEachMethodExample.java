import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import com.java8.features.defaultStaticMethodsInInterface.InterfaceTest;

public class ForEachMethodExample implements InterfaceTest{

	public static void main(String[] args) {
		List<String> strs = Arrays.asList("a", "b", "c","d");
		int count = 1;
		strs.forEach(s->{
		
			System.out.println(s);
		});
		
		//String[] arrs = (String[]) strs.toArray();
		int count2 = 1;
		for (int i = 0; i<5;i++) {
			System.out.println(count2++);
			
		}
		
	}

	@Override
	public boolean checkValue() {
		
		return false;
	}
}
