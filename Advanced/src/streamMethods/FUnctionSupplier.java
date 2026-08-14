package streamMethods;

import java.util.function.Supplier;

/*
 * Function is used to convert one object type into another.
 */
public class FUnctionSupplier {
		public static void main(String[] args) {
//		Function<String, Integer> fun=(s)->{
//			return 0;
//		};
//		Function<Integer, String> fun1=(s)->{
//			return "abc";
//		};
		
		
	//	Function<Integer, Integer> fun2= fun.compose(fun1);
		
		Supplier<String> sup1=()->("bujn");
		sup1.get();		
		
		
		}
}
