package examplesFromClass;

import java.util.Scanner;

public class HarshadNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num , sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number to check: ");
		num = sc.nextInt();
		int temp = num;
		while(num > 0)
		{
			int r = num % 10;
			sum = sum + r;
			num = num / 10;
		}
		if(temp % sum == 0)
		{
			System.out.println("the number "+temp +" is Harshad number");
		}
		else
			System.out.println("the number "+temp +" is not Harshad number");
sc.close();
	}

}
