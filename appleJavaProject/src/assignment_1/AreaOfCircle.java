package assignment_1;

import java.util.Scanner;

public class AreaOfCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float r,pi=3.14f,area;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter redius: ");
		r = sc.nextFloat();
		System.out.println("area of circle = "+(pi*r*r));
		sc.close();
	}

}
