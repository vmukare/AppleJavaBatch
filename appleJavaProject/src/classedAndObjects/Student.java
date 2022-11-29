package classedAndObjects;

import java.util.Scanner;

public class Student {
	//instance variable........
	int id,marks;
	String name,dept;
	
	void setData()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the ID: ");
		id = sc.nextInt();
		System.out.println("enter the name: ");
		name = sc.next();
		System.out.println("enter the marks: ");
		marks = sc.nextInt();
		System.out.println("enter the department: ");
		dept = sc.next();
	}
	
	void display()
	{
		System.out.println(id+" "+name+" "+marks+" "+dept);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		s1.setData();
		Student s2 = new Student();
		s2.setData();
		Student s3 = new Student();
		s3.setData();
		
		s1.display();
		s2.display();
		s3.display();
	}

}
