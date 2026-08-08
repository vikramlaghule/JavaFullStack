package lamda;
/*
 * is java is 100 object oriented language
 * No java  its 98% OOPS
 * 2% 1%=> Wrapper classes, primitive data types.
 * 	  1% => functional interface.
 * 
 */
public class One {
	
	public static void main(String[] args)
	{
		 I_run<Integer> i = (a,b)->(a+b);
		System.out.println( i.run(15, 687));
		 
		
	}
}
interface I_run<A>{
	A run(A a ,A b);
	}
