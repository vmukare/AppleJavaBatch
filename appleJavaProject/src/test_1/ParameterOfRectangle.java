package test_1;

import java.util.Scanner;

public class ParameterOfRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int l , b , p;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter length: ");
		l = sc.nextInt();
		System.out.println("enter breadth: ");
		b = sc.nextInt();
		p = (l + b)*2;
		System.out.println("parameter = "+p);

	}

}
