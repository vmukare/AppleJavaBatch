package overriding;

public class Mercedes extends Car {
	
	void dashboard()
	{
		super.dashboard();
		System.out.println("Screen");
	}
	
	void enginePower()
	{
		System.out.println("mercedes: 1900 cc");
	}

}
