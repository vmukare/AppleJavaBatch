package examplesFromClass;

import java.util.Scanner;

public class DivisibleBy3 {

	public static void main(String[] args) {
		int num;
		System.out.println("Enter the number: ");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		if(num % 3 == 0) {
			System.out.println("the number is divisible by 3");
		}
		else
			System.out.println("number is not divisible by 3");

	}

}
