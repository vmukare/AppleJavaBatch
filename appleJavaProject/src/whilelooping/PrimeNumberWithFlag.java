package whilelooping;

import java.util.Scanner;

public class PrimeNumberWithFlag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, i = 2;
		boolean flag = true;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number to check: ");
		num = sc.nextInt();
		
		while(i <= num) {
			if(num % i != 0) {
				System.out.println("not prime");
				flag = false;
				break;
			}
			i++;
		}
		if(flag) {
			System.out.println(" prime");
		}
		sc.close();
	}

}
