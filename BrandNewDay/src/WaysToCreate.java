import java.util.Optional;

public class WaysToCreate {
	public static void main(String[] args) {
		Optional<String> op=Optional.of("vikram");
		Optional<String> op1=Optional.ofNullable(null);
		Optional<String> op2=Optional.empty();
		
		if(op.isEmpty()) {
			System.out.println("it is empty");
		}
		else {
			System.out.println(op.get());
		}
		
		
		Optional<Integer> ops=op1.map((i)->(i.length()));
		
		op1.
		
	}
}
