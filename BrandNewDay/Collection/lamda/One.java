package lamda;
/*
 * is java is 100 object oriented language
 * No java  its 98% OOPS
 * 2% 1%=> Wrapper classes, primitive data types.
 * 	  1% => functional interface.
 * 
 */
public class One {
	I_run i = ()->{
		System.out.println("Hello");
		return 0;
	};
}
interface I_run{
	int run();
	}
