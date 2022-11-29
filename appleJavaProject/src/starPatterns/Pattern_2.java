package starPatterns;

import java.util.Scanner;

public class Pattern_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number to print pattern: ");
		num = sc.nextInt();
		for(int i=num; i>=1; i--) {
			for(int j=1; j<=i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
