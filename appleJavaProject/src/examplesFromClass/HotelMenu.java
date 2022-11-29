package examplesFromClass;

import java.util.Scanner;

public class HotelMenu {

	public static void main(String[] args) {
		int quantity,dish;
		System.out.println("1. maharashtrian thali          180/-");
		System.out.println("2. punjabi thali                210/-");
		System.out.println("3. rajastani thali              210/-");
		System.out.println("4. south indian                 185/-");
		System.out.println("5. gujrati thali                150/-");
		System.out.println("Please select the required thali:");
		Scanner sc = new Scanner(System.in);
		dish = sc.nextInt();
		
		switch(dish)
		{
			case 1:
				System.out.println("how much quantity do you want: ");
				quantity = sc.nextInt();
				System.out.println("total amount of your order is:  "+(quantity * 180)+"Rs");
				break;
				
			case 2:
				System.out.println("how much quantity do you want: ");
				quantity = sc.nextInt();
				System.out.println("total amount of your order is:  "+(quantity * 210)+"Rs");
				break;
				
			case 3:
				System.out.println("how much quantity do you want: ");
				quantity = sc.nextInt();
				System.out.println("total amount of your order is:  "+(quantity * 210)+"Rs");
				break;
				
			case 4:
				System.out.println("how much quantity do you want: ");
				quantity = sc.nextInt();
				System.out.println("total amount of your order is:  "+(quantity * 185)+"Rs");
				break;
				
			case 5:
				System.out.println("how much quantity do you want: ");
				quantity = sc.nextInt();
				System.out.println("total amount of your order is:  "+(quantity * 150)+"Rs");
				break;
				
			default:
				System.out.println("your choice is incorrect please enter correct choice");
		}
		sc.close();
	}

}
