package hirarchicalInheritance;

public class Faculty extends Person {
	
	String subject;
	int salary;
	
	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	void calculatePf()
	{
		int pf = salary/12;
		System.out.println("pf: "+pf);
	}
	
	void display()
	{
		System.out.println("employee ID: "+getId()+"\n"+"employee name: "+getName()+"\n"+"age: "+getAge()+"\n"+"contact: "+getContact()+"\n"+"subject: "+getSubject()+"\n"+"salary"+getSalary());
	}

}
