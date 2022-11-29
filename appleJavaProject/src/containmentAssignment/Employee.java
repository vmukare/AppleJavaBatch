package containmentAssignment;

public class Employee {
	
	private int id,salary;
	private String name;
	private Department1 dept;
	private JoinDate myDate;
	
	public void setDepartment1(Department1 dept)
	{
		this.dept=dept;
	}
	public Department1 getDepartment1()
	{
		return dept;
	}
	
	public void setJoinDate(JoinDate myDate)
	{
		this.myDate=myDate;
	}
	public JoinDate getJoinDate()
	{
		return myDate;
	}
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}
	
	void display()
	{
		System.out.println("-------employee personal details:--------");
		System.out.println(id+" "+name);
		System.out.println("--------employee company details:---------");
		System.out.println(getDepartment1()+" "+getJoinDate());
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JoinDate j = new JoinDate();
		j.setDay(12);
		j.setMonth("march");
		j.setYear(2015);
		
		Department1 d= new Department1();
		d.setId(11);
		d.setName("finance");
		d.setSalarry(50000);
		
		Employee e = new Employee();
		e.setId(101);
		e.setName("john");
		e.setDepartment1(d);
		e.setJoinDate(j);
		
		e.display();
				
	}

}
