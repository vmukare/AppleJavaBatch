package containmentAssignment;

public class SubTopic {

	int id;
	String name;
	Question q1;
	
	SubTopic(int id, String name, Question q1)
	{
		this.id=id;
		this.name=name;
		this.q1=q1;
	}
	
	public String toString()
	{
		return id+" "+name+" "+q1;
	}
}
