package multithreading;

public class Deadlock {
    public static void main(String[] args) {
	t1 t = new t1();
	t2 t2 = new t2();
	String s="ew";
	System.out.println(s);
	t.start();
	t2.start();
    }
}
class t1 extends Thread{
    public void run() {
	System.out.println("t1 started executing ");
	for (int i = 0; i < 10; i++) {
	   try {
	    wait();
	   } catch (InterruptedException e) {
	    e.printStackTrace();
	   }
	}
	notify();
	System.out.println("t1 finished exceution");
    }
}
class t2 extends Thread{
    public void run() {
	System.out.println("t2 started executing ");
	for (int i = 0; i < 10; i++) {
	    try {
		    wait();
		   } catch (InterruptedException e) {
		    e.printStackTrace();
		   }
	}
	notify();
	System.out.println("t2 finished exceution");
    }
}