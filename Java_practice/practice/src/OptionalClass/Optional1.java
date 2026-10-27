package OptionalClass;

import java.util.Optional;

public class Optional1 {

	public static void main(String[] args) {
		
		
		Optional<String> ops=Optional.ofNullable("Dharashiv");
		
		
		ops.ifPresent(s->System.out.println(s.toUpperCase()));//in consumer it takes an one input parameter
		
		Runnable r1=()->{System.out.println("Default action.");};// in the runnable it not take any input parameter.
		r1.run();
		ops.ifPresentOrElse((s)->{System.out.println(s.toUpperCase());},()->{System.out.println("DEFAULT VALU");});

	}

}
