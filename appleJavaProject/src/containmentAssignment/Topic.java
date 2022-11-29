package containmentAssignment;

public class Topic {

	int id;
	String name;
	SubTopic s1;
	
	Topic(int id, String name, SubTopic s1)
	{
		this.id=id;
		this.name=name;
		this.s1=s1;
	}
	
	public String toString()
	{
		return id+" "+name+" "+s1;
	}
	
}
