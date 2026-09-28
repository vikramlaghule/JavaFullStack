package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookSeat {	 
	 List<Seat> ls=new ArrayList<>(10);
	 
	 
	    public BookSeat() {
	    		//System.out.println("Constructor is called");
	       for(int i=1;i<=10;i++) 
	       {
	    	   ls.add(new Seat(i));
	       }
	       for(Seat seat:ls) {
	    	   System.out.println(seat);
	       }
	    }    
	   

		public void bookSeatNo(int seatNo, User user) 
		{
		Scanner scan=new Scanner(System.in);
		System.out.println("Someone is booking a seat");
			
		int bookSeatNumber=seatNo-1;
		
		if(ls.get(bookSeatNumber).isStatus()=="Available")
		{
			
			ls.get(bookSeatNumber).setStatus("Booked", user.name);
			
			System.out.println(seatNo+" is booked succesfully ");
		}else
		{
			System.out.println("This is is booked by someoneElse");
			bookSeatNo(scan.nextInt(), user);
		}
			scan.close();
	    	}
		
		
	}
		

