
package multithreading;

import java.util.ArrayList;
import java.util.List;


public class RaceCondiEx {

	public static void main(String[] args) throws InterruptedException {
		
	List<Integer> list=new ArrayList<Integer>();
		
	First_a first=new First_a(list);
	
        Second_a second=new Second_a(list);
	    
        String s="Vikram";
        
        Newt n=new Newt(s,new Second_a(list));
        
	    System.out.println(n);
	    first.start();
	    second.start();
	    
	    first.join();
	    second.join();
	    
	    
	    System.out.println(list.size());
	
	}
}


class First_a extends Thread
{
	List<Integer> list;
	
	public void run()
	{
		
		for(int i=0;i<1000;i++)
		{
			list.add(i);
		}
	}

	public First_a(List<Integer> list) {
		super();
		this.list = list;
	}
	
	
}

class Second_a extends Thread
{
	List<Integer> list;
	

	public void run()
	{

		for(int i=0;i<1000;i++)
		{
			list.add(i);
		}
	}


	public Second_a(List<Integer> list) {
		super();
		this.list = list;
	}
	
	
}

class Newt extends Thread {
    Second_a s;
    String q;
    public Newt(String s,Second_a e) {
	this.q=s;
	this.s=e;
    }
}
