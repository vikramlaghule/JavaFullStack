package streamApi;
import java.util.*;

public class StreamIntermediateOperationsExample {
    public static void main(String[] args) {   
       List<Student> list=new ArrayList<>();
       list.add(new Student(35,"vikram"));
       Student e= new Student(35, "Aman");
       list.add(e);
       list.add(new Student(65, "Rajat"));
       Student f= new Student(50, "lala");
       list.add(f);
       System.out.println("Passed Stundets: ");
       list.stream()
       .filter((s)->
    	   s.marks>35)
    		   .forEach((s)->{
    			   System.out.println(s.name);
    		   });
      
       }
      
          
   }
class Student{
	int marks;
	String name;
	public Student(int marks, String name) {
		super();
		this.marks = marks;
		this.name = name;
	}
	
}
