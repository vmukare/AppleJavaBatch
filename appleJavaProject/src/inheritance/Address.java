package inheritance;

public class Address {
	
	String area,city,state;
	int pincode;
	
	Address(String area, String city, String state, int pincode)
	{
		this.area=area;
		this.city=city;
		this.state=state;
		this.pincode=pincode;
	}
	public String toString()
	{
		return area+" "+city+" "+state+" "+pincode;
	}

}
