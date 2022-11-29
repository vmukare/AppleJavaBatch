package starPatterns;

import java.util.Scanner;

public class Patterm_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number: ");
		n = sc.nextInt();
		for(int i=n; i>=1; i--)//           i=1              i=2           i=3
		{
			for(int j=1; j<=i; j++)//    j=1  j=2     j=1 j=2 j=3     j=1 j=2 j=3
			{
				System.out.print("*");//*
				                      //**
			}                         //***
			System.out.println();
		}
	
	}

}
