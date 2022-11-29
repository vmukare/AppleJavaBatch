package inheritance;

public class Engine1 {
	int cylinder,torque;
	String rpm,company;
	
	Engine1(int cylinder, int torque, String rpm, String company)
	{
		this.cylinder=cylinder;
		this.torque=torque;
		this.rpm=rpm;
		this.company=company;
	}
	
	public String toString()
	{
		return cylinder+" "+torque+" "+rpm+" "+company;
	}

}
