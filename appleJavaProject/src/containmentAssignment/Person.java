package containmentAssignment;

public class Person {
	
	String name,contact;
	int age;
	IdProof id;
	
	Person(String name, int age, IdProof id)
	{
		this.name=name;
		this.age=age;
		this.id=id;
	}
	
	public String toString()
	{
		return name+" "+age+"\n "+id;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IdProof i1 = new IdProof(100, "john", "solapur");
		Person p1 = new Person("john", 24, i1);
		
		System.out.println(p1);
	}

}
