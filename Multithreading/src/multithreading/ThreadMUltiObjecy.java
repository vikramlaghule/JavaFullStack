package multithreading;

public class ThreadMUltiObjecy {
	public static void main(String[] args) throws InterruptedException {
		t T =new t();
		//t.startVirtualThread(T);
		//T.start();
		
		System.out.println(T.getState());
		Thread.sleep(10000);
		T.start();
		System.out.println("after start: "+T.getState());
		T.join();
		System.out.println("after completion: "+ T.getState());
		
		
	}
}
class t extends Thread {
	public void run() {
		System.out.println("this is t thread");
	}
}