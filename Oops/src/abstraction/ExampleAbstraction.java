package abstraction;

public class ExampleAbstraction {
	public static void main(String[] args) {
		Animal an=new Dog("Tommy");
		
		an.sound();
		
	}
}

abstract class PaymentService{
	
	public PaymentService(int msg) {
		super();
	}
	
	abstract public void run();
}
abstract class Animal{
	String name;
	public Animal(String name) {
		this.name=name;
		System.out.println("Object created... or called");
	}
	abstract void sound();
}
class Dog extends Animal{
	

	public Dog(String name) {
		super(name);
	}

	@Override
	void sound() {
		System.out.println("Dog is barking");
	}
	
	public Dog dj() {
		return new Dog(name);
		
	}
}