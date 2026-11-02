package ReflectionApi;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Reflection3 {

	public static void main(String[] args) throws Exception {
		
		Class<?> cl=Class.forName("ReflectionApi.Dmart");
		
		Constructor<?>[] con=cl.getDeclaredConstructors();
		
		System.out.println(con.length);
		
		for(int i=0;i<con.length;i++) {
			System.out.println(con[i]);
		}
		System.out.println("\n***************************\n");
		Method[] meth=cl.getDeclaredMethods();
		
		System.out.println("methods:- "+ meth.length);
		
		for(int i=0;i<meth.length;i++) {
			System.out.println(meth[i]);
		}
		
		System.out.println("\n**********************************\n");
		
		Field[] field=cl.getDeclaredFields();
		
		System.out.println(field.length);
		for(int i=0;i<field.length;i++) {
			System.out.println(field[i]);
		}
		
		

	}
}

class Dmart{
	
	private int i;
	private String s;
	private int id;
	private String name;
	private double pay;
	
	public Dmart() {
		
	}
	public Dmart(String s,int i) {
		this.s=s;
		this.i=i;
		
	}
	public Dmart(String name,int id,double pay) {
		this.name=name;
		this.id=id;
		this.pay=pay;
	}
	
	public void purchase() {
		System.out.println("Customers purchasing");
		
	}
 private int pay(int cash) {
		System.out.println("pay via cash:-");
		return cash;
	}
	public String name(String names) {
		System.out.println("Enter your names:-");
		return names;
	}
	
}
