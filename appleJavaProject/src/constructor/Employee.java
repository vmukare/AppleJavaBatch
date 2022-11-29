package constructor;

public class Employee {
	
	int id,salary;
	String name,dept;
	
	Employee()
	{
		id = 12;
		salary = 45000;
		name = "ram";
		dept = "finance";
	}
	
	void display()
	{
		System.out.println(id+" "+salary+" "+name+" "+dept);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee();
		e1.display();

	}

}
