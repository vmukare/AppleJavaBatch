package abstraction;

public abstract class Electronics {
	
	int price , weight;
	String color;
	
	
	public void setPrice(int price) {
		this.price = price;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public void setColor(String color) {
		this.color = color;
	}

	void processor()
	{
		System.out.println("every electronics appliances has different processor speed: ");
	}
	
	void semiConductor()
	{
		System.out.println("every electronics devices has number of semi conductors: ");
	}
	
	abstract void rating();
	abstract void electricityConsumption();
	abstract void features();
	
}
