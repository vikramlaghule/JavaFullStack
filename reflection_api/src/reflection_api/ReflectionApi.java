package reflection_api;

import java.lang.reflect.Constructor;

public class ReflectionApi
{
	/*
	 * constructors
	 * methods
	 * fields
	 * 
	 * .getClass()
	 * class.forname
	 */
	
	public static void main(String[] args) throws Exception {
		Class<?> cs=Class.forName("java.lang.String");
					
		Constructor<?> ar=cs.getDeclaredConstructor();
		System.out.println(cs.getDeclaredConstructors().length);
		
		Class<?> copy=Class.forName("reflection_api.ReflectionApi");
		Constructor<?>[] a=copy.getDeclaredConstructors();
		
		for(Constructor<?> c:a) {
			System.out.println(c);
		}
		a[0].setAccessible(true);
	       
	       a[0].newInstance("Vishal");
	}

}
class Vikram{
	String name;
	public Vikram() {
		super();
		System.out.println("Object created.....");
	}
	public Vikram(String name) {
		System.out.println("Object created......");
	}
	
}