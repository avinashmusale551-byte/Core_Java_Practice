package OptionalClass;

import java.util.Optional;

public class Optional4 {

	public static void main(String[] args) {
		
		Optional<String> ops=Optional.ofNullable(null);
		
		String s=ops.orElseThrow(()->new demoexception("are re !"));
		System.out.println(s);

	}

}
class demoexception extends RuntimeException{
	
	public demoexception(String str) {
		super(str);
	}
}
