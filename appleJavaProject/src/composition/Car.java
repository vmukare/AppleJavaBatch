package composition;

public class Car {
	
	int id,price;
	String name,color;
	
	Car(int id, String name, String color, int price, String dname, String contact)
	{
		this.id=id;
		this.name=name;
		this.color=color;
		this.price=price;
		Driver d=new Driver("suresh", "987456321");
	}

}
