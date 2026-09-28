package basic;

public class ClonethisMethod {
    public static void main(String[] args) throws CloneNotSupportedException {
	
	Address add=new Address("Latur");
	
	Student stud = new Student(1,"Vikram",add);
	Student stud1=(Student) stud.clone();
	
	System.out.println("before change");
	
	System.out.println(stud.id +" "+ stud.name+" "+stud.add);
	System.out.println(stud1.id+" "+stud1.name+" "+stud1.add);

	
	stud1.id=15;
	stud1.name="Kajal";
	stud1.add= new Address("Nanded");
	
	System.out.println("after change");
	
	System.out.println(stud.id +" "+ stud.name+" "+stud.add);
	System.out.println(stud1.id+" "+stud1.name+" "+stud1.add);
	
	/*
	 * for shallow copy or deep copy you need to implement
	 * cloneable interface on that class and override clone method 
	 */
	System.out.println();
	
    }
}
class Student implements Cloneable{
    int id ;
    String name;
    Address add;
    
    public Student(int id, String name,Address add) {
	this.id=id;
	this.name=name;
	this.add=add;
    }
    
    public Student clone() throws CloneNotSupportedException{
	
	return (Student) super.clone();
    }  
}
    class Address{
        String city;
        public Address(String city) {
    	this.city=city;
        }
        protected Object clonethis() {
    	return city;
        }
        @Override
        public Address clone() throws CloneNotSupportedException {
    
            return (Address) super.clone();
        }
        @Override
        public String toString() {
    	return ""+ city ;
        }
        
    }