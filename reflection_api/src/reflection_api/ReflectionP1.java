package reflection_api;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectionP1 {

	public static void main(String[] args) throws Exception {
		//Step 1 create the copy of any class using Class.forName method provide that 
		//class location in String that return a class 
		Class<?> cls=Class.forName("reflection_api.Demo");
		//in that copy check the constructors no.parameters and sequence of parameters and 
		//sequence of parameters to invoke that constructor or call
		Constructor<?>[] con=cls.getDeclaredConstructors();
					
		for(Constructor<?> c:con) {
			System.out.println(c);
		}
		//we know the constructors get a specific constructor using declared constructor method
		Constructor<?> c=cls.getDeclaredConstructor(int.class);
		//as the constructor is private and not accessible so first set it accessible true
		c.setAccessible(true);
		
		Constructor<?> cn=cls.getDeclaredConstructor(String.class,String.class);
		Object obj1= cn.newInstance("Vikram","Laghule");
		Object obj	=c.newInstance(12);
		
		
	}

}
