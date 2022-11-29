package classedAndObjects;

import java.util.Scanner;

public class ToStringMethod {
	int id;
	String name,dept;
	
	void setData()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter id,name,department: ");
		id = sc.nextInt();
		name = sc.next();
		dept = sc.next();
	}
	public String toString()
	{
		return id+" "+name+" "+dept;
		
	}
public static void main(String[] args) {
	
	ToStringMethod t1 = new ToStringMethod();
	ToStringMethod t2 = new ToStringMethod();
	t1.setData();
	t2.setData();
	System.out.println(t1);
	System.out.println(t2);
	
}
}
