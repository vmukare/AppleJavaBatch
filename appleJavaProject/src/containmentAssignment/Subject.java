package containmentAssignment;

public class Subject {

	int id;
	String name;
	Topic t;
	
	Subject(int id, String name, Topic t)
	{
		this.id=id;
		this.name=name;
		this.t=t;
	}
	
	public String toString()
	{
		return id+" "+name+" "+t;
	}
}
