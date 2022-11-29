package classedAndObjects;

import java.util.Scanner;

public class Employee {
	
	int id,salary,contact;
	String name,dept,email;
	
	void setData(int i, String n, String d, String e, int c, int s)
	{
		id=i;
		salary=s;
		contact=c;
		name=n;
		dept=d;
		email=e;
	}
	
	void display()
	{
		System.out.println("Employee ID : "+id);
		System.out.println("Name of employee : "+name);
		System.out.println("Department : "+dept);
		System.out.println("email ID : "+email);
		System.out.println("contact number : "+contact);
		System.out.println("Salary of employee "+salary);
	}

	public static void main(String[] args) {  
		
		for(int i=1; i<=5; i++)
		{
			System.out.println("enter the employee ID for employee "+i);
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter employee ID: ");
			int eid = sc.nextInt();
			System.out.println("Enter the name: ");
			String ename = sc.next();
			System.out.println("Enter the Department: ");
			String edept = sc.next();
			System.out.println("Enter the email: ");
			 String email = sc.next();
			System.out.println("Enter the contact number: ");
		  	 int contact = sc.nextInt();
			System.out.println("Enter the salary amount: ");
			 int salary = sc.nextInt();
			Employee e = new Employee();
			e.setData(eid, ename, edept, email, contact, salary);
			e.display();
		}
			
			
			
		
			
			
		
		

	}

}
