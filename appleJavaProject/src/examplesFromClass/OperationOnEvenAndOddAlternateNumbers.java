package examplesFromClass;

import java.util.Scanner;

public class OperationOnEvenAndOddAlternateNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num , sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number: ");
		num = sc.nextInt();
		
		while(num != 0) {
			int r = num % 10;
			if(r % 2 == 0) {
				sum = sum + r;
			}
//			if(r % 2 != 0) {
//				sum = sum + r;
//			}
			num = num / 10;
		}
		System.out.println(sum);
	}

}
