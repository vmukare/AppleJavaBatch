package test_4;

public class Employee {
	
	private int id,salary;
	private String name;
	
	void setId(int id)
	{
		this.id=id;
	}
	int getId()
	{
		return id;
	}
	
	void setSalary(int salary)
	{
		this.salary=salary;
	}
	int getSalary()
	{
		return salary;
	}
	
	void setName(String name)
	{
		this.name=name;
	}
	String getName()
	{
		return name;
	}
	
	void display()
	{
		System.out.println(id+" "+name+" "+salary);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeDetail e1 = new EmployeeDetail(101, "john", 50000);
		e1.display();
		
		Employee e2 = new Employee();
		e2.setId(102);
		e2.setName("roman");
		e2.setSalary(55000);
		e2.display();
		

	}

}
class EmployeeDetail{
	 int id;
	 int salary;
	 String name;

	EmployeeDetail(int id, String name, int salary )
	{
		this.id=id; 
		this.salary=salary;
		this.name=name;
	}
	
	void display()
	{
		System.out.println(id+" "+name+" "+salary);
	}

	

	}
