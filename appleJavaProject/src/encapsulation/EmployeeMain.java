package encapsulation;

import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee();
		Scanner sc = new Scanner(System.in);
		for(int i=1; i<=5; i++)
		{
			System.out.println("Enter the details for employee "+i);
			
			
			System.out.println("enter id, name, department, contact and salary: ");
			int id = sc.nextInt();
			String name = sc.next();
			String dept = sc.next();
			String contact = sc.next();
			int salary = sc.nextInt();
			
			e1.setId(id);
			e1.setName(name);
			e1.setDept(dept);
			e1.setContact(contact);
			e1.setSalary(salary);
			
			System.out.println(e1.getId()+" "+e1.getName()+" "+e1.getDept()+" "+e1.getContact()+" "+e1.getSalary());
			
			
		}
		sc.close();
		
	}
	

}
