package examplesFromClass;

import java.util.Scanner;

public class ArithmaticOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1, sum = 0, sum1 = 0,sum2=0,  product = 1,limit;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter limit");
		limit = sc.nextInt();
		while(i <= limit) {
			//sum of alternate number
			sum = sum + i;
			//sum of all even numbers
			if(i % 2 == 0) {
				sum1 = sum1 + i;
			}
			//sum of all odd numbers
			else {
				sum2 = sum2 + i;
			}
			//product of numbers
			product = product * i;
			i++;
		}
		System.out.println("sum of all numbers = "+sum);
		System.out.println("sum of all even numbers = "+sum1);
		System.out.println("sum of all odd numbers = "+sum2);
		System.out.println("product of all numbers = "+product);
		sc.close();
	}

}
