package OptionalClass;

import java.util.List;
import java.util.Optional;

public class Optional5 {

	public static void main(String[] args) {
		
		Optional<Integer> ops=List.of(11,23,41,56,21,32,10)
				.stream()
				.min((i,j)->Integer.compare(i, j));
		System.out.println(ops.get());

	}

}
