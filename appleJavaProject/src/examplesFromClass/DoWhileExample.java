package examplesFromClass;

import java.util.Scanner;

public class DoWhileExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a , b;
		char ch;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("enter the value of a: ");
			a = sc.nextInt();
			System.out.println("enter the value of b: ");
			b = sc.nextInt();
			System.out.println(a + b);
			System.out.println("do you want to continue (y/n)");
			ch = sc.next().charAt(0);
		}while(ch == 'y' || ch == 'Y');

	}

}
