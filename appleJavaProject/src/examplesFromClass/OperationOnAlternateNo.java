package examplesFromClass;

import java.util.Scanner;

public class OperationOnAlternateNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num , sum = 0 , product = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number: ");
		num = sc.nextInt();
		
		while(num != 0) {
			int rem = num % 10;
			sum = sum + rem;
			product = product * rem;
			num = num/10;
		}
		System.out.println(sum);
		System.out.println(product);
	}

}
