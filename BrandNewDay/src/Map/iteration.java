package Map;

import java.util.Map;
import java.util.TreeMap;

public class iteration {
/*
 * Iterating over a map 
 * one key and one value is an entry
 * and multiple entries are called entry set
 * how do we iterate over a map
 * 
 */
	public static void main(String [] args) {
		TreeMap<Integer, String> tm= new TreeMap<Integer, String>();
		tm.put(1, null);
		tm.put(15, "asssa");
		tm.put(12, "magar");
		tm.put(13,"sapna");
		
		for (Map.Entry<Integer, String> entry : tm.entrySet()) {
		    Integer key = entry.getKey();
		    String value = entry.getValue();
		    System.out.println(key + " -> " + value);
		}
		

	}
}
