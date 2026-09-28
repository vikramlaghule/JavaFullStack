package threadBasic;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Two {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		System.out.println("Execution started");
		Class<?> cls=Class.forName("threadBasic.Student");
		
		Constructor<?>[]	 ars=cls.getDeclaredConstructors();
							
		for(Constructor<?> cs: ars)
		{
			System.out.println(cs);
		}
					
	
			Constructor<?> st=cls.getDeclaredConstructor();
			st.setAccessible(true);
		Student t =(Student) st.newInstance(12);
		
			//st.
	}
}
class Student{
	private static int id;
	private Student() {
		 System.out.println("Kon re jisne muze invoke kiya");
	}
	private Student(int a) 
	{
		System.out.println("number wala");
	}
}