package assignment_2;
import java.util.Scanner;

public class Vowels {

	public static void main(String[] args) {
		char ch;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the character: ");
		ch = sc.next().charAt(0);
		
		switch(ch)
		{
			case 'a':
				
			case 'e':
				
			case 'i':
				
			case 'o':
				
			case 'u':
				
			case 'A':
				
			case 'E':
				
			case 'I':
				
			case 'O':
				
			case 'U':
				System.out.println("vowel");
				break;
				
			default:
				System.out.println("consonant");
		}
		sc.close();
	}

}
