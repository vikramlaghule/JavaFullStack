package collection;

import java.util.ArrayList;
import java.util.List;


public class List1 {
	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		String ab=new String("abc");
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			list.add(null);
		}
		for (int i = 0; i < 10; i++) {
			list.add(i);
		}
		System.out.println("Important methods of List");
		list.add(15);
		list.add(14,25);
		System.out.println(list.size());
		list.add(22, 21);
		/* 1.list.add(element);  Adds element/values at the end of list 
		 * 2.list.add(index,element); add a element at specific index
		 * 3
		 * 
		 */
		List <Integer> list1 = new ArrayList<Integer>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		System.out.println(list1.contains(list));
		
	}
}
