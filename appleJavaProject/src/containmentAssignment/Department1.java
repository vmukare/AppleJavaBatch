package containmentAssignment;

public class Department1 {
	
	private int id,salary;
	private String name;
	
	public void setSalarry(int salary)
	{
		this.salary=salary;
	}
	public int getSalary()
	{
		return salary;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String toString()
	{
		return id+" "+name+" "+salary;
	}
	

}
