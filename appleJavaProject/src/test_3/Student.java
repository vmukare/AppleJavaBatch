package test_3;

import java.util.Scanner;

public class Student {
	int maths,science,english;
	float per;
	int total;
	
	void getDetails()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the marks of maths,science and english: ");
		maths = sc.nextInt();
		science = sc.nextInt();
		english = sc.nextInt();
	}
	
	void percentage()
	{
		total = maths+science+english;
		per = total/3;
		System.out.println("percentage = "+per);
		
		if(per>=70) {
			System.out.println("1st class");
		}
		else {
			System.out.println("2nd class");
		}
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		s1.getDetails();
		s1.percentage();

	}

}
