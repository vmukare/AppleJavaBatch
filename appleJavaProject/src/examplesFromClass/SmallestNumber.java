package examplesFromClass;

import java.util.Scanner;

public class SmallestNumber {

	public static void main(String[] args) {
int num1,num2,num3,num4;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value of num1: ");
		
		num1 = sc.nextInt();
		System.out.println("enter the value of num2: ");
		
		num2 = sc.nextInt();
		System.out.println("enter the value of num3: ");
		num3 = sc.nextInt();
		
		System.out.println("enter the value of num4: ");
		num4 = sc.nextInt();
		
		if(num1 < num2 && num1 < num3 && num1 < num4) {
			System.out.println("the number num1 = "+ num1 + " is smaller");
	}
		else if(num2 < num1 && num2 < num3 && num2 < num4) {
			System.out.println("the number num2 = "+ num2 + " is smaller");
	}
		else if(num3 < num1 && num3 < num2 && num3 < num4) {
			System.out.println("the number num3 = "+ num3 + " is smaller");
	}
		else{
			System.out.println("the number num4 = "+ num4 + " is smaller");
	}
		sc.close();

	}

}
