package advanced;

public class VolatileKeyWord {
    public static void main(String[] args) {
	Sharedresource sr = new Sharedresource();
	
	Thread t=new Thread(()->{
	    System.out.println("worker thread is running");
	    while(sr.flag) {
		
	    }
	    System.out.println("worker is stopped");
	    
	});
	Thread t2=new Thread(()->{
	    
	    
	    System.out.println("Flag has been turned false");
	    sr.stop();
	    
	});
	t.start();
	t2.start();
	}
    }

class Sharedresource{
    public boolean flag=true;
    
    public void stop() {
	this.flag=false;
    }
}