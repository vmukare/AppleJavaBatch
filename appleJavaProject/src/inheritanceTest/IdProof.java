package inheritanceTest;

public class IdProof extends Person {
	
	String name , validity;
	int number;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getValidity() {
		return validity;
	}
	
	public void setValidity(String validity) {
		this.validity = validity;
	}
	
	public int getNumber() {
		return number;
	}
	
	public void setNumber(int number) {
		this.number = number;
	}
	
	
	void display()
	{
		if(getName().equalsIgnoreCase("adharCard"))
		{
			super.display();
			System.out.println("Id proof name: "+getName()+"\n"+"Id proof number: "+getNumber()+"\n"+"Id proof validity: "+getValidity());
		}
		else
		{
			System.out.println("enter valid id name");
		}
	}
	

}
