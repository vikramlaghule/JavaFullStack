package collection;

import java.util.HashSet;
import java.util.Objects;

public class Hashset {
	public static void main(String[] args) {
		HashSet<Student> set=new HashSet<>();
		Student a=new Student(1, "Vikram");
		Student b=new Student(2, "manav");
		Teacher t=new Teacher(1,"bara");
		System.out.println(t);
		
		set.add(a);
		set.add(b);
	}
}
class Student extends Object{
	int marks;
	String name;
	
	public Student(int marks, String name) {
		super();
		this.marks=marks;
		this.name=name;
	}
	
	public String toString() {
		return this.name+":"+this.marks;
	}
	@Override
	public boolean equals(Object obj) {
		Student stud =(Student)obj;
		
		return this.marks==stud.marks && this.name.equals(stud.name);	
	}
}
class Teacher extends Object{
	int car;
	String man;
	public Teacher(int car, String man) {
		super();
		this.car = car;
		this.man = man;
	}
	@Override
	public int hashCode() {
		return Objects.hash(Integer.valueOf(car), man);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Teacher other = (Teacher) obj;
		return car == other.car && Objects.equals(man, other.man);
	}
	@Override
	public String toString() {
		return "Teacher [car=" + car + ", man=" + man + "]";
	}	
	
}