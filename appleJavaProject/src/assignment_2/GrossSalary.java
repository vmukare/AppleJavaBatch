package assignment_2;

import java.util.Scanner;

public class GrossSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int basic_salary;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter salary: ");
		basic_salary = sc.nextInt();
		
		if(basic_salary <= 10000) {
			System.out.println("HRA = 20% , DA = 80%");
		}
		if(basic_salary <= 20000) {
			System.out.println("HRA = 25% , DA = 90%");
		}
		if(basic_salary >= 20000) {
			System.out.println("HRA = 25% , DA = 95%");
		}
		sc.close();
	}

}
