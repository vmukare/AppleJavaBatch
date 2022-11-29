package containmentAssignment;

public class Question {
	
	int id;
	String name;
	
	Question(int id, String name)
	{
		this.id=id;
		this.name=name;
	}
	
	public String toString()
	{
		return id+" "+name;
	}

}
