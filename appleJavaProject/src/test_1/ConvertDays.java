package test_1;

import java.util.Scanner;

public class ConvertDays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int day , year , week , days;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number of days: ");
		day = sc.nextInt();
		year = day/365;
		day = day % 365;
		System.out.println("years: "+year);
		week = day / 7;
		day = day % 7; 
		System.out.println("weeks: "+week);
		days = day;
		System.out.println("days: "+day);
		sc.close();

	}

}
