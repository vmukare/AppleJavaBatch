package classedAndObjects;

import java.util.Scanner;

public class StudentDetail {
	 
	int id;
	String name;
	float percentage;
	int maths_Marks,english_Marks,Science_Marks;
	Scanner sc = new Scanner(System.in);
	
	void accept()
	{
		System.out.println("Accept the student details");
		System.out.println("Enetr the student name: ");
		name = sc.nextLine();
		System.out.println("Enter the student id: ");
		id = sc.nextInt();
		System.out.println("Enter marks of maths , english and science : ");
		maths_Marks = sc.nextInt();
		english_Marks = sc.nextInt();
		Science_Marks = sc.nextInt();
	}
	
	void calculate()
	{
		float total =  maths_Marks + english_Marks + Science_Marks;
		 percentage = (total/300)*100;
		System.out.println("percentage = "+percentage);
	}
	
	void display()
	{
		System.out.println("*****Student Details*****");
		System.out.println("Student name = "+name);
		System.out.println("Student ID = "+id);
		System.out.println("maths marks = "+ maths_Marks);
		System.out.println("english marks = "+ english_Marks);
		System.out.println("science marks = "+ Science_Marks);
		System.out.println("percentage = "+percentage);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentDetail d1 = new StudentDetail();
		d1.accept();
		d1.calculate();
		d1.display();
		
	}

}
