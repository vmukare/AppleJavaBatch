
package test_3;

import java.util.Scanner;

public class StarPattern {
	void star() {
		int rows;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number of rows: ");
		rows = sc.nextInt();
		
		for(int i=1; i<=rows; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	void number() {
		
		int row;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number of rows: ");
		row = sc.nextInt();
		
		for(int i=0; i<=row; i++)
		{
			for(int j=0; j<=i; j++)
			{
				if(i%2 == 0)
				{
					System.out.print("0 ");
				}
				else
					System.out.print("1 ");
			}
			System.out.println();
		}
	}
public static void main(String[]args) {
	StarPattern s1 = new StarPattern();
	StarPattern s2 = new StarPattern();
	s1.star();
	s2.number();
	
}
}
