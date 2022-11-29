package containmentAssignment;

public class Branch {

	int id;
	String name;
	Subject s;
	
	Branch(int id, String name, Subject s)
	{
		this.id=id;
		this.name=name;
		this.s=s;
	}
	
	public String toString()
	{
		return id+" "+name+" "+s;
	}
}
