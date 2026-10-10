package collection;

public class GenericsTypesafes {

	public static void main(String[] args) {
		I_NYC<String, String> i=new One();
		System.out.println(i.calc("Lalu","Salu"));

	}

}
interface I_NYC<T,R>{
	public R calc(T t1,T t2);
}
 class One implements I_NYC<String,String>{
	public String calc(String s,String s2) {
		return s+s2;
	}
}