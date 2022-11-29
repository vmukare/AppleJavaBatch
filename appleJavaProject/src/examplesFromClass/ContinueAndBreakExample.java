package examplesFromClass;

import java.util.Scanner;

public class ContinueAndBreakExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int limit,i=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter num: ");
		limit = sc.nextInt();
		while(i <= limit) {
			i++;
			if(i % 3 == 0) {
				continue;
			}
			System.out.println(i+" ");
		}
		sc.close();
	}

}
