package assignment_1;

import java.util.Scanner;

public class AllArithmaticOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a , b;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter two numbers: " );
		a = sc.nextInt();
		b = sc.nextInt();
		
		System.out.println("addition = "+(a + b));
		System.out.println("substraction = "+(a - b));
		System.out.println("multiplication = "+(a * b));
		System.out.println("division = "+(a / b));
		sc.close();
	}

}
