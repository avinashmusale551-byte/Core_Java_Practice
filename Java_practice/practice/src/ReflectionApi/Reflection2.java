package ReflectionApi;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Reflection2 {

	public static void main(String[] args) throws ClassNotFoundException {
		
		Class<?> cls=Class.forName("ReflectionApi.college");
		
		Method[] mt=cls.getDeclaredMethods();
		
		//System.out.println(mt.length);
		
		for(int i=0;i<mt.length;i++) {
			//System.out.println(mt[i]);
		}
		
		Field[] field=cls.getDeclaredFields();
		System.out.println(field.length);
		for(int i=0;i<field.length;i++) {
			System.out.println(field[i]);
		}

	}

}

class college{
	
	int id1;
	String name1;
	public void study() {
		int id;
		String name;
	}
	public String name(String name,String id) {
		
		return name + id;
		
	}
}
