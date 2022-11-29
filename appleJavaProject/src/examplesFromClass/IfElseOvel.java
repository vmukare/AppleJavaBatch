package examplesFromClass;

import java.util.Scanner;

public class IfElseOvel {

	public static void main(String[] args) {
		char ch;
		System.out.println("enter character: ");
		Scanner sc = new Scanner(System.in);
		ch = sc.next().charAt(0);
		
		if(ch == 'a' || ch == 'A') {
			System.out.println("Ovel");
		}
		else if(ch == 'e' || ch == 'E') {
			System.out.println("Ovel");
		}
		else if(ch == 'i' || ch == 'I') {
			System.out.println("Ovel");
		}
		else if(ch == 'o' || ch == 'O') {
			System.out.println("Ovel");
		}
		else if(ch == 'u' || ch == 'U') {
			System.out.println("Ovel");
		}
		else
			System.out.println("consolant");

	}

}
