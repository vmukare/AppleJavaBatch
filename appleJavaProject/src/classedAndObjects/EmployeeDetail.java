package classedAndObjects;

import java.util.Scanner;

public class EmployeeDetail {
	
	int id,salary,rating,bonus;
	String name,dept;
	long contact;
	
	void getData()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter id: ");
		id = sc.nextInt();
		System.out.println("enter name: ");
		name = sc.next();
		System.out.println("enter department: ");
		dept = sc.next();
		System.out.println("enter contact number: ");
		contact = sc.nextLong();
		System.out.println("enter salary: ");
		salary = sc.nextInt();
		System.out.println("enter ratings from 1 to 10: ");
		rating = sc.nextInt();
	}
	
	void bonus()
	{
		if(rating >= 5)
		{
			bonus = salary/5;
		}
		else {
			bonus = salary/rating;
		}
		System.out.println("Bonus = "+bonus);
	}
	
	void pfCalculation()
	{
		int pf = salary/12;
		System.out.println("pf contribution: "+pf);
	}
	
	void display()
	{
		System.out.println("employee ID is "+id);
		System.out.println("employee name is "+name);
		System.out.println("employee salary is "+salary);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeDetail e1 = new EmployeeDetail();
		e1.getData();
		e1.display();
		e1.bonus();
		e1.pfCalculation();

	}

}
