package abstraction;

public class Swift extends Car {
	
	void setData(String engine, int price)
	{
		this.engine=engine;
		this.price=price;
	}
	
	void displayInfo()
	{
		System.out.println(price+" "+engine);
	}
	
	void dashboard()
	{
		System.out.println("swift has: Ac , music system , screen");
	}

	void safetyFeatures()
	{
		System.out.println();
	}

	@Override
	void setData() {
		// TODO Auto-generated method stub
		
	}
}
