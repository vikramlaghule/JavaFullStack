package streamMethods;

import java.util.ArrayList;
import java.util.List;


public class StreamPractice {
	public static void main(String[] args)
	{
		ArrayList<Student1> list=new ArrayList<Student1>();
		Student1 s1 = new Student1("Vikram", new int[]{12, 12, 32, 34, 45, 45});
		Student1 s2 = new Student1("Rahul", new int[]{78, 82, 69, 91, 85, 88});
		Student1 s3 = new Student1("Priya", new int[]{95, 89, 92, 94, 90, 96});
		Student1 s4 = new Student1("Anjali", new int[]{56, 61, 73, 68, 70, 65});
		Student1 s5 = new Student1("Karan", new int[]{88, 84, 79, 90, 86, 92});
		
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		list.add(null);
		list.add(null);
		System.out.println(list);
		ArrayList<Integer> list1=new ArrayList<>();
		list1.add(12);
		list1.add(123);
		System.out.println(list1);
		
		List<Integer> list2=new ArrayList<>();
		list2.add(1554);
		list2.add(1214);
		System.out.println(list2);
		
		
		
		
		
	}
}
class Student1{
	String name;
	int[] marks;
	public Student1(String name, int[] marks) {
		super();
		this.name = name;
		this.marks = marks;
	}
}
class Manish<T>{
}
class Ans extends Manish {
	
}