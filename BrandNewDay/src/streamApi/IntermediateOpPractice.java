package streamApi;

import java.util.List;

public class IntermediateOpPractice {
	public static void main(String[] args)
	{
		 List<Integer> list = List.of(12, 16, 15, 17, 11, 19);

	        list.stream()
	            .peek(n -> System.out.println("Before filter: " + n))
	            .filter(n -> n > 15)
	            .peek(n -> System.out.println("After filter: " + n))
	            .forEach(System.out::println);
	        
	        
	}
}
