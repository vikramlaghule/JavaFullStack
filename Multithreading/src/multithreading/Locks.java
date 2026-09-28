package multithreading;

import java.util.ArrayList;
import java.util.List;

public class Locks {
    public static void main(String[] args) {
	
	Resource r = new Resource();
	
	prod p = new prod();
	cons c = new cons();
	
	p.start();
	c.start();
	
	System.out.println(r);
	
    }
}
class Resource{
    List<Integer> list=new ArrayList<Integer>();
    int counter;
   
    public synchronized void add() throws InterruptedException {
	while(list.size()==5) {
	    wait();
	    System.out.println("element kadh sie full zali");
	}
	list.add(++counter);
	System.out.println("element added re consumer"+counter);
	notify();
	
    }
    public synchronized void remove() throws InterruptedException {
	while(list.isEmpty()) {
	    wait();
	    System.out.println("element add kr re producer me remove ky karu mg");
	}
	int el=list.remove(0);
	System.out.println("element kadla re kar atta add"+el);
	notify();
	
    }
    
}
class prod extends Thread{
    Resource re;
    public void run() {
	while(true) {
	    
	    
	}
    }
}
class cons extends Thread{
    Resource re;
    public void run() {
	
    }
}