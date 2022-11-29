package nestedForLoop;

import java.util.Scanner;

public class NumberPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter rows: ");
		row = sc.nextInt();
		for(int i=1; i<=row; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(i);
				
			}
			System.out.println();
		}
	}

}
