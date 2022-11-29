package examplesFromClass;

import java.util.Scanner;

public class StudentGrades {

	public static void main(String[] args) {
		
		float english,maths,geography,ethics,science;
		float  percentage;
		int totalMarks = 500;
		float obtainedMarks;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the marks of english: ");
		english = sc.nextInt();
		
		System.out.println("enter the marks of maths: ");
		maths = sc.nextInt();
		
		System.out.println("enter the marks of geography: ");
		geography = sc.nextInt();
		
		System.out.println("enter the marks of ethics: ");
		ethics = sc.nextInt();
		
		System.out.println("enter the marks of science: ");
		science = sc.nextInt();
		
		obtainedMarks = english + maths + geography + ethics + science;
		percentage = (obtainedMarks / totalMarks) * 100;
		System.out.println(percentage);
		
		
		if(percentage <= 100 && percentage >= 70) {
			System.out.println("Distinction");
		}
		else if (percentage <= 70 && percentage >= 60) {
			System.out.println("A Grade");
		}
		else if(percentage <= 60 && percentage >= 40) {
			System.out.println("B Grade");
		}
		else
			System.out.println("Fail");
		
		

	}

}
