package home_assignment;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num , rev = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number: ");
		num = sc.nextInt();
		int temp = num;
		while(num != 0) {
			int r = num % 10;
			rev = rev * 10 + r;
			num = num / 10;
		}
		if(temp == rev) {
			System.out.println("The number " +temp+ " is palindrome number");
		}
		else {
			System.out.println("The number " +temp+ " is not palindrome number");
		}
		sc.close();

	}

}
