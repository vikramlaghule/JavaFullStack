package streamMethods;
import java.util.*;


// TERMINAL OPERATIONS AND INTERMEDIATE OPERATIONS:
/*
 * Unless and until terminal operations are called the streams
 * are not get started.
 * If you want to start the stream you must call the terminal operations.
 * for each(Consumer) collect allMatch anyMatch nonMatch (Predicate) etc.. count it return a long
 * and some intermediate operations are
 * filter(Predicate) map flatMap sort, map,  etc..
 * peek is used in debugging it is an 
 * it uses consumer operations 
 * THE DIFFRENCE BETWEEN FOR EACH AND PEEK
 */

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
