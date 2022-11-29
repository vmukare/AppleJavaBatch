package assignment_1;

import java.util.Scanner;

public class CalculateTotalAndPercentage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float english , maths , science , geography , ethics;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the marks of english: ");
		english = sc.nextInt();
		
		System.out.println("enter the marks of maths: ");
		maths = sc.nextInt();
		
		System.out.println("enter the marks of science: ");
		science = sc.nextInt();
		
		System.out.println("enter the marks of geography: ");
		geography = sc.nextInt();
		
		System.out.println("enter the marks of ethics: ");
		ethics = sc.nextInt();
		
		float total = english + maths + science + geography + ethics;
		System.out.println("total marks = "+total);
		
		float percentage = (total/500)*100;
		System.out.println("percentage = "+percentage);

	}

}
