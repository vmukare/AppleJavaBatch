package examplesFromClass;

import java.util.Scanner;

public class HowManyDays {

	public static void main(String[] args) {
		int num,year;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number: ");
		num = sc.nextInt();
		System.out.println("enter year");
		year = sc.nextInt();
		
		switch(num) {
			case 1:
			case 3:	
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				System.out.println("month contain 31 days");
				break;
				
			case 2:
				if(year % 4 == 0) {
					System.out.println("there are 29 days in feb in this year");
				}
				else {
					System.out.println("there are 28 days in feb in this year ");
				}
					
				break;
				
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.println("month contain 30 days");
				break;
				
			default:
				System.out.println("enter valid number");
		}
		sc.close();

	}

}
