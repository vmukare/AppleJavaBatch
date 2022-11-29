  package examplesFromClass;

import java.util.Scanner;

public class FindCapital {

	public static void main(String[] args) {
		String str;
		System.out.println("enter the state: ");
		Scanner sc = new Scanner(System.in);
		str = sc.nextLine();
		str = str.toLowerCase();
		
		switch(str) {
		
			case "maharashtra":
				System.out.println("capital of "+ str+ " is mumbai");
				break;
				
			case "madhya pradesh":
				System.out.println("capital of "+ str +" is bhopal");
				break;
				
			case "goa":
				System.out.println("capital of "+ str +" is panaji");
				break;
				
			case "uttar pradesh":
				System.out.println("capital of "+ str +" is lucknow");
				break;
				
			case "karnataka":
				System.out.println("capital of "+ str +" is benglore");
				break;
				
			case "chattisgarh":
				System.out.println("capital of "+ str +" is raipur");
				break;
				
			default:
				System.out.println("enter the valid state");
							
		}
		sc.close();
	}

}
