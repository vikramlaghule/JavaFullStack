package reflection_api;

import java.util.Optional;

public class Otionall {
	/*
	 * Optional class is used to avoid null pointer exception
	 * 
	 */
		public static void main(String[] args) {
			Optional<String> op=Optional.of("vikram");
			Optional<String> op1=Optional.ofNullable(null);
			Optional<String> op2=Optional.empty();
			
			if(op.isEmpty()) {
				System.out.println("it is empty");
			}
			else {
				System.out.println(op.get());
			}
			
			
			Optional<Integer> ops=op1.map((i)->(i.length()));
			
	//we create an optional class for custom class and its methods
			
			System.out.println(Manager.name);
	}

}
class Manager{
	 int id;
	 String dept;
	 static String name;
	
	@Override
	public String toString() {
		return "Manager [id=" + id + ", dept=" + dept + "]";
	}
	public Manager(int id, String dept) {
		super();
		System.out.println("value of instance variable "+this.id +this.dept);
		this.id = id;
		this.dept = dept;
	}
	public void test() {
		System.out.println("value of instance variable "+this.id +this.dept+this.name);
	}
	
}

