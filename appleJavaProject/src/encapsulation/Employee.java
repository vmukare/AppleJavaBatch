package encapsulation;

public class Employee {
	
	private int id,salary;
	private String name,dept,contact;
	
	//public getter and setter
	
	public void setId(int id)
	{
		this.id=id;
	}
	public int getId()
	{
		return id;
	}
	
	public void setSalary(int salary)
	{
		this.salary=salary;
	}
	public int getSalary()
	{
		return salary;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return name;
	}
	
	public void setDept(String dept)
	{
		this.dept = dept;
	}
	public String getDept()
	{
		return dept;
	}
	
	public void setContact(String contact)
	{
		this.contact = contact;
	}
	public String getContact()
	{
		return contact;
	}

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
//
}
