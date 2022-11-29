package classedAndObjects;

import java.util.Scanner;

public class StudentInfo {
	int id1,marks1;
	String name1,dept1;
	void setData(int id, String name, String dept, int marks)
	{
		id1=id;
		name1=name;
		dept1=dept;
		marks1=marks;
	}
	void display()
	{
		System.out.println(id1+" "+name1+" "+dept1+" "+marks1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=2;
		for(int i=1; i<=n; i++)
		{
			System.out.println("enter the detail for student "+i);
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the id: ");
		int sid = sc.nextInt();
		System.out.println("enter the name: ");
		String sname = sc.next();
		System.out.println("enter the department: ");
		String sdept = sc.next();
		System.out.println("enter the marks: ");
		int smarks = sc.nextInt();
		
		StudentInfo s1 = new StudentInfo();
		s1.setData(sid, sname, sdept, smarks);
		s1.display();
		}
//		StudentInfo s2 = new StudentInfo();
//		System.out.println("enter the id: ");
//		 sid = sc.nextInt();
//		System.out.println("enter the name: ");
//		 sname = sc.next();
//		System.out.println("enter the department: ");
//		 sdept = sc.next();
//		System.out.println("enter the marks: ");
//		 smarks = sc.nextInt();
//		 s2.setData(sid, sname, sdept, smarks);
//		 
//		 s1.display();
//		 s2.display();
	}

}
