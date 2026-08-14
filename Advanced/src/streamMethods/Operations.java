package streamMethods;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Operations {
	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<>();
		list.add(12);
		list.add(15);
		list.add(15);
		list.add(48);
		
		Predicate<Integer> pr=t ->{
			return t>45;
		};
		System.out.println(pr.test(15));
		System.out.println(list.stream()
				.anyMatch((s)->(s>12)));		

	}
}
