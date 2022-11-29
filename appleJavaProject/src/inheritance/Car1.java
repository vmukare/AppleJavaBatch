package inheritance;

public class Car1 {
	
	int id,price;
	String name,color;
	Engine1 e;
	
	Car1(int id, String name, String color, int price, Engine1 e)
	{
		this.id=id;
		this.name=name;
		this.color=color;
		this.price=price;
		this.e=e;
	}
	
	public String toString()
	{
		return id+" "+name+" "+color+" "+price+" \n"+e;
	}

}
