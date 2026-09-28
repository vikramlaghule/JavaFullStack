package multithreading;

public class RaceCondition {
    	public static void main(String[] args) throws InterruptedException {
    	Counter c=new Counter();
    	Thread01 t1=new Thread01(c);
    	Thread02 t2=new Thread02(c);
    	
    	t1.start();
    	t2.start();
    	t1.join();
    	t2.join();
    	System.out.println(c.getCount());
	}
    	
    	
}
class Counter{
    int count=0;
    
    public void counterincrese() {
	this.count++;
    }
    public int getCount() {
	return this.count;
    }
}
class Thread01 extends Thread{
    
    Counter count1;
    
    public Thread01(Counter count1) {
	super();
	this.count1 = count1;
    }

    public void run() {
	for (int i = 0; i < 10000; i++) {
	    count1.counterincrese();
	}
    }
}
class Thread02 extends Thread{
    Counter count1;
    
    public Thread02(Counter count1) {
	super();
	this.count1 = count1;
    }

    public void run() {
	for (int i = 0; i < 10000; i++) {
	    count1.counterincrese();
	}
    }
}
