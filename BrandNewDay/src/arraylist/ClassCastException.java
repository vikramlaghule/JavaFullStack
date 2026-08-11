package arraylist;

import java.util.LinkedHashSet;


public class ClassCastException {
	public static void main(String[] args)
	{
		LinkedHashSet<Student> student = new LinkedHashSet<Student>();
		Student std1 = new Student();
		Student std2 = new Student();
		student.add(std1);
		student.add(std2);
		System.out.println(std1.mob);		
	}
}
class Student {
	int id;
	String name;
	int mob=10;
}