package optional;

import java.util.Optional;

/**
 * Optional: Container that may or may not contain a value.
 * Used to handle possible null values safely.
 *
 * Quick Notes:
 * of()         -> value must not be null
 * ofNullable() -> value can be null
 * empty()      -> creates empty Optional
 *
 * isPresent()  -> checks value exists
 * isEmpty()    -> checks value is absent
 * get()        -> gets value (avoid blindly using)
 * ifPresent()  -> runs code if value exists
 *
 * orElse()     -> returns value or default
 * orElseGet()  -> returns value or creates default
 * orElseThrow()-> throws exception if empty
 *
 * map()        -> transforms value
 * filter()     -> keeps value if condition is true
 * or()         -> returns another Optional if empty
 */
public class OptionalClass {

    public static void main(String[] args) {

        // Create Optional with non-null value
        Optional<String> op = Optional.of("Vikram");

        // Allows null -> becomes Optional.empty()
        Optional<String> op1 = Optional.ofNullable(null);

        // Creates empty Optional
        Optional<String> op2 = Optional.empty();


        // Check if empty
        if (op2.isEmpty()) {
            System.out.println("It is empty");
        }


        // Check if value is present
        if (op.isPresent()) {
            System.out.println(op.get());
        }


        // Execute only if value exists
        op.ifPresent(System.out::println);


        // Default value if empty
        System.out.println(op1.orElse("Unknown"));


        // Default value using Supplier
        System.out.println(op1.orElseGet(() -> "Unknown"));


        // Transform value
        Optional<Integer> length = op.map(String::length);
        System.out.println(length);


        // Filter value
        Optional<String> result =
                op.filter(name -> name.length() > 5);

        System.out.println(result);


        // Another Optional if empty
        Optional<String> result2 =
                op1.or(() -> Optional.of("Alternative"));

        System.out.println(result2);


        // Compare Optional
        System.out.println(op1.equals(op2));
        
 
              
    }
}
