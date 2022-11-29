package whilelooping;

import java.util.Scanner;

public class PrintEvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1,limit;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter limit: ");
		limit = sc.nextInt();
		while(i <= limit) {
			if(i % 2 == 0) {
				System.out.println(i);
			}
			i++;
		}
		sc.close();
	}

}
