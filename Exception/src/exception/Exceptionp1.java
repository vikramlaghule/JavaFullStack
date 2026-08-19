package exception;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Exceptionp1 {
	
	public static void main(String[] args) {
		/*
		 * Function -> apply(t);
		 * Predicate -> test();
		 * Supplier -> get();
		 * Consumer -> 
		 * 
		 */
		
		
		Function<String, Integer> fun=(s)->(s.length());
		
		System.out.println(fun.apply("Vikram"));
		
		Predicate<String> pre=(s)->(s.contentEquals("vikram"));
		
		System.out.println(pre.test("vikram"));
		
		Supplier<String> sup=()->{
			System.out.println("My name is inspector chingam");
			return "vikram";
		};
		sup.get();
		//System.out.println();
		
		Consumer<String> con=(s)->{
			System.out.println("this is consumer it just consume the given data");
		};
		con.accept(null);
		
		
	}
	
	public static boolean isprime() {
		
		try {
			
			return true;
		}catch(Exception e){
			
		}
		return false;
		
		
	}
	public static boolean isPrime() {
		
		try {
			
			return true;
		}catch(Exception e){
			
		}
		return false;
		
		
	}
	
}
