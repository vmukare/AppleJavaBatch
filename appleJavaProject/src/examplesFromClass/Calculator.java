package examplesFromClass;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter two numbers: ");
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println(" 1. Addition\n 2. Substraction\n 3. Multiplication\n 4. Division");
		System.out.println("enter your choice");
		int ch = sc.nextInt();
		
		switch(ch)
		{
			case 1:
				System.out.println("addition is = "+(a+b));
				break;
			case 2:
				System.out.println("substraction is = "+(a-b));
				break;
			case 3:
				System.out.println("multiplication is = "+(a*b));
				break;
			case 4:
				System.out.println("division is = "+(a/b));
				break;
			default:
				System.out.println("enter valid choice");
		}
		sc.close();
	}

}
