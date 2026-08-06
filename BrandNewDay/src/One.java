import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TreeMap;

public class One {
	public static void main(String[] args) {
		/*HashSet  internally implements HashMap to store the elements
		 *LinkedHaset internally implements LinkedHashMap
		 *
		 *Value of hashset is store as the key to HashMap and and its value is Element
		 * initial capacity is 16 and load factor 
		 * 
		 * 
		HashSet<Integer> hs = new HashSet<>();
		LinkedHashSet<Integer> lhm = new LinkedHashSet<Integer>();
		TreeMap<Integer, String> tm = new TreeMap<Integer, String>();
		
		/*
		 * natural comparable
		 * and custom is used comparator 
		 * whenever collection we have pass the passing algorithm if did not provide 
		 * the sorting algorithm classcastException
		 * whenever we have to sort the custom class without implementing comparable
		 * or comparator it will give class cast exception
		 */
		LinkedHashSet<student> st= new LinkedHashSet<student>();
		st.add(null);
		st.add(new student());
		//sout
		Hashtable<Integer, String> table = new Hashtable<Integer, String>();
		/*initial capacity 11 loadfactor 0.75f
		 * HashTable 
		 * no null key no null value
		 * synchronized => slower than the other map classes
		 * insertion order is not maintained 
		 * 
		 */
						table.put(1, null);
		
		
	}
}
class student{
	
}
