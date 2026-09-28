//package basic;
//
//public class First {
//    public static void main(String[] args) throws CloneNotSupportedException {
//	
//	Student stud = new Student(1,"Vikram");
//	Student stud1=(Student) stud.clonethis();
//	System.out.println("before change");
//	System.out.println(stud.id +" "+ stud.name);
//	System.out.println(stud1.id+" "+stud1.name);
//	
//	stud1.id=15;
//	stud1.name="Kajal";
//	
//	System.out.println("after change");
//	System.out.println(stud.id +" "+ stud.name);
//	System.out.println(stud1.id+" "+stud1.name);
//	
//	/*
//	 * for shallow copy or deep copy you need to implement
//	 * cloneable interface on that class and override clone method 
//	 */
//	System.out.println();
//	
//    }
//}
//class Student implements Cloneable{
//    int id ;
//    String name;
//    
//    public Student(int id, String name) {
//	this.id=id;
//	this.name=name;
//    }
//    
//    protected Student clonethis() throws CloneNotSupportedException{
//	return (Student) this.clone();
//    }
//    
//}