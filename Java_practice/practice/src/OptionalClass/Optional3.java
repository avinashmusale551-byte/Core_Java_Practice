package OptionalClass;

import java.util.Optional;

public class Optional3 {

	public static void main(String[] args) {
		Optional<String> ops=Optional.ofNullable(null);
		
		System.out.println(ops.flatMap(i->Optional.of(i.toUpperCase())));
		System.out.println(ops.orElse("Mumbai"));

	}

}
