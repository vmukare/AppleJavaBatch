package inheritance;

public class Car {
	String company,color;
	int price;
	Engine e;
	
	public String getCompany() {
		return company;
	}
	
	public void setCompany(String company) {
		this.company = company;
	}
	
	public Engine getE() {
		return e;
	}

	public void setE(Engine e) {
		this.e = e;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public Engine e(Engine e)
	{
		return e;
	}

}
