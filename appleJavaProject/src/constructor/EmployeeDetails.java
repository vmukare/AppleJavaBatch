package constructor;

import java.util.Scanner;

public class EmployeeDetails {
	int id,salary;
	String name,dept;
	float pf;
	
	 EmployeeDetails(int i, String n, String d, int s, float p)
	 {
		  this.id = i;
		  this.name = n;
		  this.dept = d;
		  this.salary = s;
		  this.pf = p;
	 }
	 
	    void display() {
		System.out.println(id+" "+name+" "+dept+" "+salary+" "+pf);
		 
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter id,name,department,salary,pf: ");
		int id= sc.nextInt();
		String name = sc.next();
		String dept = sc.next();
		int salary = sc.nextInt();
		int pf = sc.nextInt();
		 EmployeeDetails e1 = new  EmployeeDetails(id, dept, dept, id, pf);
		
		
	}

}
