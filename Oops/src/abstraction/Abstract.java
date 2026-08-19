package abstraction;


public class Abstract {
	public static void main(String[] args) {
		Tesla t=new Tesla(12);
	}
}
@FunctionalInterface
interface car{
	void run();
}


class Tesla implements car{
	int speed;
	public Tesla(int i) {
		speed=i;
	}

	@Override
	public void run() {
		if(speed>100) {
			throw new OverspeedException("your overspeeding");
		}
		else {
			System.out.println("your car speed is in limit");
		}
	}
	
}
class OverspeedException extends RuntimeException{

	public OverspeedException(String msg) {
		super(msg);
	}
}