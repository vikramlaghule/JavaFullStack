package multithreading;

public class LifeCycle {
    public static void main(String[] args) {
	
	/*
	 * New
	 * Runnable
	 * Running
	 * waiting/Timed waiting
	 * Running
	 * Dead
	 */
	
	Thread t=new Thread(new car());
	t.start();
    }
}
class car implements Runnable{

    @Override
    public void run() {
	int i=0;
	while(i<100) {
	    System.out.println("this is a thread of car");
	    i++;
	}
    }  
}