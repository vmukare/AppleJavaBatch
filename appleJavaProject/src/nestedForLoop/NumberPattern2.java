package nestedForLoop;

import java.util.Scanner;

public class NumberPattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char row;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter rows: ");
		row = sc.next().charAt(0);
		for(char i='a'; i<='d'; i++)
		{
			for(char j='a'; j<=i; j++)
			{
				System.out.print(j);
				
			}
			System.out.println();
		}

	}

}
