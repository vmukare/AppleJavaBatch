package constructor;

import java.util.Scanner;

public class Movie {
	
	int id,releaseYear;
	String name,producer,budget;
	
	Movie(int id, String name, String producer, int releaseYear, String budget)
	{
		
		this.id = id;
		this.name = name;
		this.producer = producer;
		this.releaseYear = releaseYear;
		this.budget = budget;
	}
	
	public String toString()
	{
		return id+" "+name+" "+producer+" "+releaseYear+" "+budget;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter id,name,producer,releaseYear,budget");
		int id = sc.nextInt();
		String name = sc.next();
		String producer = sc.next();
		int releaseYear = sc.nextInt();
		String budget = sc.next();
		Movie m1 = new Movie(id, name, producer, releaseYear, budget);
		
		System.out.println(m1);

	}

}
