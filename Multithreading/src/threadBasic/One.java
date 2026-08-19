package threadBasic;

public class One {
/*
 * illegal state modification exception 
 * interpreted exception 
 * thread starvation 
 * context switching 
 *
 */
	
	//Multithreading in java
	/*
	 * Multithreading is a process in which we create small independent threads
	 * to execute the task 
	 * a thread is a smallest possible program component 
	 * In java you need to create your own threads there are two ways to create thread in java
	 * 1.  extending a thread class on your class.
	 * 2.  implementing the runnable interface on your class.
	 *  the second way is more preferable because you can implement multiple interfaces 
	 *  and you can extend another class
	 * 
	 * multithreading vs multiprocessing vs multitasking 
	 * 
	 * 
	 * 
	 */
	// Context switching in java multithreading
	
	/* it is a process when the CPU time is divided between multiple threads 
	 * assume if you have a and b CPU may execute a for some time and then b for some time 
	 * it might come back to thread a for resuming the execution while doing this it must
	 * remember the last execution point of i.e it must remember the context thats why
	 * it is called context switching
	 * 
	 * 
	 */
	// Thread starvation 
	/*
	 * while context switching if CPU didn't provide a time and resource to a thread
	 * then the thread starvation 
	 */
	public static void main(String[] args) {
		
		t2 t= new t2();
		t1 T=new t1();
		
		t.start();
		T.start();
	}
}
class t1 extends Thread{
	public void run() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		for(int i=0;i<=100;i++) {
			
			
			if(i%2==0) System.out.println("odd: "+i);
		}
		System.out.println("thread 1 execution completed");

 	}
}

class t2 extends Thread{
	public void run() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		for(int i=0;i<=100;i++) {
			if(i%2==0)
				
				System.out.println("even: "+i);
		}
		System.out.println("thread 2 execution completed");
	}
}

