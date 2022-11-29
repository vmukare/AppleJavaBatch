package classedAndObjects;

import java.util.Scanner;

public class Calculator {
	void add()
	{
		int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter two numbers: ");
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println("Addition is = "+(a+b));
	}
	void substract()
	{
		int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter two numbers: ");
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println("substraction is = "+(a-b));
	}
	void multiply()
	{
		int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter two numbers: ");
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println("Multiplication is = "+(a*b));
	}
	void divide()
	{
		int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter two numbers: ");
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println("Division is = "+(a/b));
	}
	

}
	