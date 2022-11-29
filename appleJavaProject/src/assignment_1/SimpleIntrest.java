package assignment_1;

import java.util.Scanner;

public class SimpleIntrest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float p,t,r,SI;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter value of p: ");
		p = sc.nextFloat();
		System.out.println("enter value of t: ");
		t = sc.nextFloat();
		System.out.println("enter value of r: ");
		r = sc.nextFloat();
		SI = (p*r*t)/100;
		System.out.println("Simple Intrest = "+SI);

	}

}
