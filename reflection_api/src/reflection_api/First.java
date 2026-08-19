package reflection_api;


public class First {

	public static void main(String[] args) {
		
		
	
	}
	
}
class Demo{
	
	private int id;
	private String first_name;
	private static String last_name;
	final private static String name="Vikram";
	final private String surname="Laghule";
	
	 private Demo() {
		 System.out.println("Object create of non para constructor");
	 }
	 private Demo(int number) {
		 System.out.println(" priavte constructor invoked int parameter the passed value is: "+number);
	 }
	 private Demo(String name) {
		 System.out.println("constructor called using the constructor takes String"+name);
	 }
	 private static void demo() {
		 System.out.println("this is static priavte method");
	 }
	 public Demo(String name,String nam) {
		 System.out.println("a public constructor tha does not requre to set accessible true becaues "
		 		+ "it is already accessible");
	 }
	 
}