package ReflectionApi;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Reflection4 {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, 
            IllegalArgumentException, InvocationTargetException, ClassNotFoundException, 
            NoSuchMethodException, SecurityException, NoSuchFieldException {
        
        
        Class<?> cls = Class.forName("ReflectionApi.bus");
        
        
        Constructor<?> cons = cls.getDeclaredConstructor(int.class, String.class);
        
       
        cons.setAccessible(true); 
        
        
        Object obj = cons.newInstance(124, "mumbai"); //object creation with newinstance() method
        
        System.out.println("**********************");
        
        Method m=cls.getDeclaredMethod("display", String.class);
        
        m.setAccessible(true);
        m.invoke(obj, "latur");
        
        Field f=cls.getDeclaredField("dist");
        f.trySetAccessible();
        System.out.println(f.get(obj));
        
        Method m1=cls.getDeclaredMethod("run",int.class,String.class);
        m1.trySetAccessible();
        m1.invoke(null, 23,"kolhapur");
        
        

       
    }
}

class bus {
	
	private String dist="Dharashiv";
    private bus(int n, String name) {
        System.out.println("--------");
        System.out.println(n + name.length()); // Output will be 124 + 6 = 130
    }
    
    private void display(String city) {
    	System.out.println("welcome to:");
    }
    
    private static void run(int num,String sk) {
    	System.out.println(num+sk.length());
    }
}
