package set;

import java.util.Comparator;
import java.util.TreeSet;

public class Treeset {
	 public static void main(String[] args) {
		TreeSet<Integer> set=new TreeSet<>(new CustomSorting());
		set.add(12);
		set.add(23);
		set.add(15);
		set.add(23);
		set.add(64);
		System.out.println(set);
		
	}
}
class CustomSorting implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		if(o1>o2) {
			return -1;
		}
		else if(o2>o1){
			return 1;
		}
		return 0;
	}
	
}