package encapsulation;

import java.util.Scanner;

public class FlightMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Flight f1 = new Flight();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter id: ");
		int id=sc.nextInt();
		
		System.out.println("enter company name(air india/indigo)");
		String company = sc.next();
		
		System.out.println("enter source: ");
		String source = sc.next();
		
		System.out.println("enter destination: ");
		String destination = sc.next();
		
		System.out.println("enter booking class\nbuisness\neconomy\nfirst class\nbasic economy/n ");
		String bookingClass = sc.next();
		
		f1.setId(id);
		f1.setSource(source);
		f1.setDestination(destination);
		f1.setCompany(company);
		f1.setBookingClass(bookingClass);
		f1.getTicketRate();
		f1.rateAsPercompany();
		f1.fair();
		f1.display();
		
	}

}
