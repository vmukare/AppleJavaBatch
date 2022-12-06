package inheritance;

public class Father extends GrandFather {
	
	String fName1;

	public void setFName1(String fName1) {
		this.fName1 = fName1;
	}
	
	void display()
	{
		super.display();
		System.out.println("-----------father information----------");
		System.out.println("first name: "+fName1+"\n"+"middle name: "+super.fName+"\n"+"last name: "+GrandFather.lName+"\n");
	}

}
