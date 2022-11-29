package test_2;

import java.util.Scanner;

public class CalculatePower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int index,base,power = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter base:");
		base = sc.nextInt();
		System.out.println("enter index: ");
		index = sc.nextInt();
		for(int i=1; i<=index; i++)
		{
			 power= power*base;
			
		}
       System.out.println(power);
	}

}
