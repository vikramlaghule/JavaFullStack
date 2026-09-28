package practice;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class HAS {
	public static void main(String[] args) {
		 // Setup dummy data
        List<Integer> numbers = List.of(1, 2, 3, 4);
        List<String> words = List.of("Java", "Stream", "API");

        // =====================================================================
        // OVERLOAD 1: Accumulator Only
        // Signature: Optional<T> reduce(BinaryOperator<T> accumulator)
        // =====================================================================
        // Key Note 1: Returns an Optional because an empty stream has no identity value to fallback on.
        // Key Note 2: Operates strictly on a single data type (T).
        Optional<Integer> sum1 = numbers.stream()
                .reduce((a, b) -> a + b);
        
        System.out.println("1-Arg Result: " + sum1.orElse(0));


        // =====================================================================
        // OVERLOAD 2: Identity + Accumulator
        // Signature: T reduce(T identity, BinaryOperator<T> accumulator)
        // =====================================================================
        // Key Note 1: Returns raw type T (not Optional) because the identity acts as a guaranteed default.
        // Key Note 2: If the stream is empty, it returns the identity value.
        // Key Note 3: The identity value must be a neutral element for the operation (e.g., 0 for +, 1 for *).
        int sum2 = numbers.stream()
                .reduce(0, (a, b) -> a + b);

        System.out.println("2-Arg Result: " + sum2);


        // =====================================================================
        // OVERLOAD 3: Identity + Accumulator + Combiner
        // Signature: <U> U reduce(U identity, BiFunction<U,? super T,U> accumulator, BinaryOperator<U> combiner)
        // =====================================================================
        // Key Note 1: Allows transforming data types. Reduces a stream of type T into a result of type U.
        // Key Note 2: The 'Accumulator' maps and adds a stream element (T) into a partial result (U).
        // Key Note 3: The 'Combiner' merges two partial results (U + U) together.
        // Key Note 4: CRITICAL - In sequential streams (.stream()), the combiner is NEVER called. 
        //             It is only executed in parallel streams (.parallelStream()) to stitch thread results.
        int totalCharacters = words.parallelStream()
                .reduce(
                    0,                                              // Identity (Type U: Integer)
                    (partialCount, word) -> partialCount + word.length(), // Accumulator (U + T -> U)
                    (count1, count2) -> count1 + count2             // Combiner (U + U -> U)
                );

        System.out.println("3-Arg Result (Parallel): " + totalCharacters);
	}
}
