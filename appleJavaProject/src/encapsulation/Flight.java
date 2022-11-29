package encapsulation;

public class Flight {
	
	private int id,ticketRate;
	private String company, source, destination,bookingClass;
	
	public void setId(int id)
	{
		this.id=id;
	}
	public int getId()
	{
		return id;
	}
	
	public void setTicketRate(int ticketRate)
	{
		this.ticketRate=ticketRate;
	}
	public int getTicketRate()
	{
		return ticketRate;
	}
	
	public void setSource(String source)
	{
		this.source=source;
	}
	public String getSource()
	{
		return source;
	}
	
	public void setDestination(String destination)
	{
		this.destination=destination;
	}
	public String getDestination()
	{
		return destination;
	}
	
	public void setBookingClass(String bookingClass)
	{
		this.bookingClass=bookingClass;
	}
	public String getBookingClass()
	{
		return bookingClass;
	}
	
	public void setCompany(String company)
	{
		this.company=company;
	}
	public String getCompany()
	{
		return company;
	}
	
	void rateAsPercompany()
	{
		if(company.equalsIgnoreCase("Air india"))
		{
			ticketRate = 2000;
		}
		else if(company.equalsIgnoreCase("indigo"))
		{
			ticketRate = 2500;
		}
	}
	
	void fair()
	{
		if (bookingClass.equalsIgnoreCase("buisness") && bookingClass.equalsIgnoreCase("economy"))
		{
			ticketRate = ticketRate*3;
		}
		else if(bookingClass.equalsIgnoreCase("first class") && bookingClass.equalsIgnoreCase("basic economy"))
		{
			ticketRate = ticketRate*2;
		}
	}
	void display()
	{
		System.out.println(id+" "+company+" "+source+" "+destination+" "+bookingClass+" "+ticketRate);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
