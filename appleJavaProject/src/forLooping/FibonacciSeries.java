package forLooping;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num , a = 0 , b = 1;
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		for(int i=1; i<=num; i++)
		{
			
			System.out.print(a+",");
			
			int c = a + b;
			a = b;
			b = c;
		}
		sc.close();
	}

}
