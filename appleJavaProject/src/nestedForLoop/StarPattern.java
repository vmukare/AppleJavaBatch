package nestedForLoop;

import java.util.Scanner;

public class StarPattern {
	public static void main(String[] args) {
		int row;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number of row: ");
		row = sc.nextInt();
		for(int i=1; i<=row; i++) {
			for(int j=1; j<=i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("/n-------------------------downward pattern-----------------------------/n");
		
		for(int i=row; i>=1; i--)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
