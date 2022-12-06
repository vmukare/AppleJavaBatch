package inheritance;

public class Child extends Father {
	
	String fName2;

	public void setFName2(String fName2) {
		this.fName2 = fName2;
	}
	
	void display()
	{
		super.display();
		System.out.println("-----------children information------------");
		System.out.println("first name: "+fName2+"\n"+"middle name:"+super.fName1+"\n"+"last name: "+GrandFather.lName);
	}

}
