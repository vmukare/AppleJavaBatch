package test_3;

import java.util.Scanner;

public class NationalGame {
	void country() {
		int country;
		Scanner sc = new Scanner(System.in);
		System.out.println(" 1.India\n 2.China\n 3.Bangladesh\n 4.Italy\n 5.United States");
		System.out.println("Enter your choice in number: ");
		country = sc.nextInt();
		
		switch(country)
		{
		 case 1:
			System.out.println("National game of India is Hockey");
			break;
		 case 2:
			 System.out.println("National game of China is Table Tennis");
			 break;
		 case 3:
			 System.out.println("National game of Bangladesh is Kabbadi");
			 break;
		 case 4:
			 System.out.println("National game of Italy is Football");
			 break;
		 case 5:
			 System.out.println("National game of United States is Baseball");
			 break;
		 default:
			 System.out.println("invalid choice");
			 break;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NationalGame game = new NationalGame();
		game.country();
	}

}
