package home_assignment;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num , rev = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number: ");
		num = sc.nextInt();
		
		while(num != 0) {
			int r = num % 10;
			rev = rev * 10 + r;
			num = num / 10;
		}
		System.out.println(rev);
	}

}
