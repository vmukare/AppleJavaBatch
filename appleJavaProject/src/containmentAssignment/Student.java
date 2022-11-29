package containmentAssignment;

public class Student {
	
	int rollNo;
	String name;
	
	Student(int rollNo, String name)
	{
		this.rollNo=rollNo;
		this.name=name;
	}
	
	public String toString()
	{
		return rollNo+" "+name;
	}
	
	public static void main(String[] args) {
		
		Student s1 = new Student(123, "john");
		Department d1 = new Department(101, "civil",s1);
		
		System.out.println(d1);
		
	}

}
