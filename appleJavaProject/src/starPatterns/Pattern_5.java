package starPatterns;

import java.util.Scanner;

public class Pattern_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cnt;
	
		Scanner sc = new Scanner(System.in);
		System.out.println("enter count: ");
		cnt = sc.nextInt();
		for(int j=1; j<=cnt; j++)
		{
			int n1=0,n2=1,n3;
		for(int i=1; i<=j; i++)
		{
			
			System.out.print(n1+" ");
			n3 = n1 + n2;
			//System.out.print(n3+" ");
			n1 = n2;
			n2 = n3;
		}
		System.out.println();
		}
	}

}
