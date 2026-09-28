package practice;

public class Seat{
	int seatNumber;
	String status;
	String BookedBy;
	public Seat(int seatNumber) {
		super();
		this.seatNumber = seatNumber;
		status = "Available";
		BookedBy=null;
	}
	@Override
	public String toString() {
		return "Seat [seatNumber=" + seatNumber + ", status=" + status + "]";
	}
	public int getSeatNumber() {
		return seatNumber;
	}
	public String isStatus() {
		return status;
	}
	public void setStatus(String status,String Bookedby) {
		this.status = status;
		this.BookedBy=Bookedby;
		
	}
	
	
}
