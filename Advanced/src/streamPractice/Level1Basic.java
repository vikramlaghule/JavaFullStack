package streamPractice;

import java.util.ArrayList;
import java.util.List;

public class Level1Basic {
	public static void main(String[] args) {
		//Given a List<Integer>, print all even numbers.
/*
 *   Given a List<Integer>, print all even numbers.
 *   Print all numbers greater than 50.
 *   Convert a list of names to upper case.
 *   Convert a list of names to their lengths.	
 *   Find the count of numbers divisible by 3.
 *   Find the maximum and minimum number.
 *   Remove duplicate numbers.
 *   Sort numbers ascending.
 *   Sort numbers descending.
 *   Print names starting with "A".
 *   Find the first number greater than 100.
 *   Check whether all numbers are positive
 *   Check whether any number is divisible by 7.
 *   Check whether no number is negative.
 *   Calculate the sum of all numbers.	
 */
	List<Integer> list=new ArrayList<>();
	
	list.add(1);
	list.add(2);
	list.add(94);
	list.add(4);
	list.add(5);
	list.add(65);
	list.add(7);
	list.add(8);
	list.add(9);
	list.add(10);
	list.add(65);
	list.add(65);
	System.out.println("Even numbers");
		list.stream()
		.filter(s->(s%2==0))//predicate 
		.forEach((t)->{
		System.out.println(t);});//consumer 
		
	System.out.println("Numbers greater than 50");
	list.stream()
	.filter(t->(t>50))	//intermediate operation
	.forEach(s->{		//terminal operation
		System.out.println(s);
	});
	
	ArrayList <String> names=new ArrayList<String>();
	names.add("vikram");
	names.add("ravan");
	names.add("savan");
	names.add("kavya");
	System.out.println("To upper case names");
	names.stream()
	.forEach(f->{
		System.out.println(f.toUpperCase());
	});
	System.out.println("length of the given numbers");
	names.stream()
	.map((d)->(d.length()))
	.forEach(s->{
		System.out.println(+s);
	}); 
	
	long count= list.stream()
			.filter(s->(s%3==0))
			.count();
	System.out.println("Number divisible are "+count);
	
	
	System.out.println("maximum and minum number");
	list.
	sort((a,b)->Integer.compare(a, b));
	System.out.println("maximum number: "+list.getFirst()+" minmum number: "+list.getLast());
	list.stream()
	.distinct()
	.forEach(System.out::println);
	

	}// Main method 
}// Main class
