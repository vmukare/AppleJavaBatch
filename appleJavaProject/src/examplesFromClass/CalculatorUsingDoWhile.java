package examplesFromClass;

import java.util.Scanner;

public class CalculatorUsingDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a , b;
		int ch;
		char ch1;
		Scanner sc = new Scanner(System.in);
		System.out.println("1. Addition/n 2. Substraction/n 3. Multiplication/n 4. Division/n");
		System.out.println("Enter your choice: ");
		ch = sc.nextInt();
		do {
			switch(ch) {
				case 1:
					System.out.println("enter value of a: ");
					a = sc.nextInt();
					System.out.println("enter value of b: ");
					b = sc.nextInt();
					System.out.println("Addition = "+(a+b));
					break;
				case 2:
					System.out.println("enter value of a: ");
					a = sc.nextInt();
					System.out.println("enter value of b: ");
					b = sc.nextInt();
					System.out.println("Substraction = "+(a-b));
					break;
				case 3:
					System.out.println("enter value of a: ");
					a = sc.nextInt();
					System.out.println("enter value of b: ");
					b = sc.nextInt();
					System.out.println("Multiplication = "+(a*b));
					break;
				case 4:
					System.out.println("enter value of a: ");
					a = sc.nextInt();
					System.out.println("enter value of b: ");
					b = sc.nextInt();
					System.out.println("Division = "+(a/b));
					break;
					default:
						System.out.println("error,entered incorrect choice.");
			}
			System.out.println("du yo want to continue: (y/n)");
			ch1 = sc.next().charAt(0);
		}while(ch1 == 'y' || ch1 == 'Y');

	}

}
 