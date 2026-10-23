package LambdaExpression;

public class LExpression4 {

	public static void main(String[] args) {
		
		I_k len=(s,k)->{return s.length()+k.length();};
		System.out.println(len.length("abskjdbd","sjkschsk"));

	}
}
interface I_k{
	int length(String s,String k);
}