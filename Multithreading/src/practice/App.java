package practice;

import java.util.Scanner;
/*
 * YOUR CURRENT PROJECT
       ↓
Multiple User objects
       ↓
Multiple Threads
       ↓
Same seat requested by multiple users
       ↓
Observe race condition
       ↓
synchronized
       ↓
Fix race condition
       ↓
Seat cancellation
       ↓
wait()
       ↓
notify()
       ↓
enum for SeatStatus
       ↓
Input validation
       ↓
Clean class responsibilities
 */
public class App {
	public static void main(String[] args) {
		BookSeat book =new BookSeat();
		
		User user=new User(1,"Vikram");
		Scanner scan =new Scanner(System.in);
		Thread user1=new Thread(()->{
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			int seatNo=scan.nextInt();
			System.out.println("hey"+user.name+"Enter the seat number you want to book");
			book.bookSeatNo(seatNo,user);
			scan.close();
		}		
		);
		user1.start();	
	}
}

