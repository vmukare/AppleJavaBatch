package starPatterns;

import java.util.Scanner;

public class Pattern_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number: ");
		num = sc.nextInt();
		
		for(int i=num; i>=1; i--)
		{
			
			for(int s=1; s<=i; s++)
			{
				System.out.print(" ");//this loop is for space..
			}
			
			for(int y=i; y<=num-1; y++)
			{
				System.out.print(y);
			}
			
			for(int x=num; x>=i; x--)
			{
				System.out.print(x);
			}
			System.out.println();
		}
		
	}

}
