package containmentAssignment;

public class Institute {
	
	int id;
	String name;
	Branch b;
	
	Institute(int id, String name, Branch b)
	{
		this.id=id;
		this.name=name;
		this.b=b;
	}
	
	public String toString()
	{
		return id+" "+name+" "+b;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Question q1 = new Question(12, "what is jvm?");
		SubTopic s1 = new SubTopic(11, "java basic",q1);
		Topic t1 = new Topic(104, "java", s1);
		Subject s2 = new Subject(123, "programming", t1);
		Branch b1 = new Branch(154, "computer", s2);
		Institute i1 =new Institute(45, "thinkQuotient", b1);
		System.out.println(b1);

	}

}
