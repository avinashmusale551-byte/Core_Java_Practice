package ReflectionApi;

import java.lang.reflect.Constructor;

public class Reflection1 {

	public static void main(String[] args) throws Exception {
		
		// 1. Handled ClassNotFoundException by throwing Exception from main
		Class<?> cls = Class.forName("ReflectionApi.Employee");
		
		Class<?> cls1 = Class.forName("java.lang.String");
		
		// 2. Changed getDeclaredConstructor() to getDeclaredConstructors() 
		// 3. Added the <?> generic type to the Constructor array
		Constructor<?>[] cons = cls1.getDeclaredConstructors();
		
		System.out.println(cons.length);
		
		for(int i = 0; i < cons.length; i++) {
			System.out.println(cons[i]);
		}

	}
}

class Employee {
	public Employee() {
		
	}
}
