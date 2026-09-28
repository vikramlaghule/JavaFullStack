package reflectionApi;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class One {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, 
	InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		 Class<?> c=Student.class;//1
		
		 Student sst=new Student();
		 Class<?> g=sst.getClass();//2
		 Class<?> t	=Class.forName("reflectionApi.Student");
		 
		 Constructor<?>[]	con=	t.getDeclaredConstructors();
		 
		 for(Constructor<?> c: con)
		 {
			 System.out.println(c);
		 }
		 
		 String n; 
		Constructor<?> s=t.getDeclaredConstructor(String.class);
		
		s.setAccessible(true);
		Student st=(Student) s.newInstance("Virkam");
		
		
		
		
		
	}
}
class Student extends Object{
	String name;
	private static String number;
	private String nation;
	public Student()
	{
		System.out.println("public constructor");
	}
	
	private Student(String name)
	{
		this.name=name;	
		System.out.println("I invoked this class using constructor my name is: "+ name);
	}
	
	private static int addition(int a,int b)
	{
		return a+b;
	}
		
	private static int substraction(int a, int b)
	{
		return a-b;
	}
		
}