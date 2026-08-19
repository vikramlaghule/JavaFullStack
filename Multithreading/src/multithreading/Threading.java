package multithreading;

public class Threading {
	public static void main(String[] args) {
		
		Thread1 t=new Thread1("***************This is first thread****************");
		Thread1 t1=new Thread1("##############This is second thread################");
		
		t1.start();
		t.start();
		/*  LIFE CYCLE OF THREAD
		 * new 
		 * runnable 
		 * running 
		 * waiting 
		 * running 
		 * dead
		 */
		
		// CONTEXT SWITICHING 
		/*
		 * context switching is a process when CPU is executing multiple threads it provide resource to each thread
		 * randomly for executing thread when it come back to that thread again it start from the last line of 
		 * of executed code it does not start again this is nothing but context switching
		 * 
		 */
	}
}
class Thread1 extends Thread{
	String name;
	public Thread1(String name) {
		this.name=name;
	}
	public void run() {
		for (int i = 0; i < 101; i++) {
			System.out.println(name);
		}
	}
}
