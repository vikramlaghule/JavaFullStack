package Collection;

import java.util.Comparator;
import java.util.TreeSet;

public class Lii {
	
	public static void main(String[] args) {
		TreeSet<Student> set = new TreeSet<Student>();
		set.add(new Student(100,"Vikram"));
		set.add(new Student(101,"Ajay"));
		System.out.println(set);
	}
	
}
class Car{
	
}
class Student implements Comparator {

	int id;
	String name;
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		return 0;
	}
	/*
	 * Stream API is java 8 feature which was created to process the collection of data
	 * in a functional and declarative way 
	 * 
	 */
	
	
}
