package streamApi;


import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateConsumer {
	/*
	 * Stream API is java 8 feature which was created to process the collection of data
	 * in a functional and declarative way 
	 * 
	 */
	
	/*
	 * Using stream API we modify the objects stored in collections
	 */
	
	    // FEATURES OF STREAM API 
	/*
	 * It will not modify the original collection class.
	 * Stream does not store the data. 
	 * Supports filtering and transformation.
	 * Lazy evaluation => Intermediate operations aren'nt executed 
	 * until the terminal operation is called. 
	 * Can be created from multiple sources array, collections, file 
	 * inputs.
	 * There is a stream method in the collection which will convert a 
	 * collection into stream for processing the data efficiently.
	 */
	
	//THERE ARE 4 CORE FUNCTIONAL INTERFACES IN STREAM
	/* 
	 * 
	 * Predicate
	 * Consumer
	 * Function
	 * Supplier
	 * 
	 */
	/*
	 * Predicate=> using test method in predicate
	 *  It is used in filtering operations in stream API
	 *  Consumer <T>
	 *  consumer does return anything it has two methods 
	 *  
	 */
	public static void main(String[] args)
	{
		Predicate<String> p= (s)->(s.startsWith("abc"));
		System.out.println(p.test("abcds"));
		
			Predicate<Integer> p1=(i)->(i%2==0);
			Predicate<Integer> p2=p1.and((v)->(v>10));
			System.out.println(p2.test(12));
			
		
		
		Consumer<String> con=(s)->{
			System.out.println(s.length());
			System.out.println("Consumer interface accept method demo");};
		con.accept("s");
	
	}
}






