package examplesFromClass;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		int year;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter year to find days in feb: ");
		year = sc.nextInt();
		
		switch(year)
		{
			case 2000:
			case 2001:
			case 2002:
			case 2003:
			case 2004:
			case 2005:
			case 2006:
			case 2007:
			case 2008:
			case 2009:
			case 2010:
			case 2011:
			case 2012:
			case 2013:
			case 2014:
			case 2016:
			case 2017:
			case 2018:
			case 2019:
			case 2020:
			case 2021:
			case 2022:
			case 2023:
			case 2024:
				if(year % 4 == 0) {
					System.out.println("the entered year is leap year");
					System.out.println("this year has 29 days in feb");
				}
				else {
					System.out.println("this year has 28 days in feb");
				}
			break;	
			default:
				System.out.println("enter valid choice");
		}

	}

}
