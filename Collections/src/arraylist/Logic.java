package arraylist;

import java.util.ArrayList;

public class Logic {
	 public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		
		list.add(15);
		list.add(15);
		list.add(154);
		list.add(55);
		list.add(52);
		
		for(int i=0;i<list.size();i++) {
		    int num=list.get(i);
		    int counter=0;
		    if(list.indexOf(list.get(i))!=i) {
			continue;
		    }
		    
		    for(int j=0;j<list.size();j++) {
			if(list.get(j)==num) {
			    counter++;
			}		
		    }
		    System.out.println("num"+num+":"+counter);
		}
		
		
	}
}
