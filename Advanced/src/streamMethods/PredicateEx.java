package streamMethods;

import java.util.function.Predicate;

public class PredicateEx {
	public static void main(String[] args) {
		Predicate<Integer> p= s->{
			return s%2==0;
		};
		
		System.out.println(p.test(15));
		
		
	}
}
