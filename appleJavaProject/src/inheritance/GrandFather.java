package inheritance;

public class GrandFather {
	
	String fName, mName;
	static String lName = "Mukare";
	
	public void setFName(String fName) {
		this.fName = fName;
	}
	public void setMName(String mName) {
		this.mName = mName;
	}
	
	
	void display()
	{
		System.out.println("-----------Grand Father information----------");
		System.out.println("first name: "+fName+"\n"+"middle name: "+mName+"\n"+"last name: "+lName+"\n");
	}
	
	

}
