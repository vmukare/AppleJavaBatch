package whilelooping;

import java.util.Scanner;

public class NumberPrinting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1 , count;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the count: ");
		count = sc.nextInt();
		while(i <= count) {
			System.out.println(i);
			i++;
		}
		sc.close();
	}

}
