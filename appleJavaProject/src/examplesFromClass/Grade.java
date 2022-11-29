package examplesFromClass;
import java.util.Scanner;
public class Grade {

	public static void main(String[] args) {
		int percentage;
		System.out.println("enter the prcentage: ");
		Scanner sc = new Scanner(System.in);
		percentage = sc.nextInt();
		
		if(percentage <= 100 && percentage >= 70) {
			System.out.println("Distinction");
		}
		else if (percentage <= 70 && percentage >= 60) {
			System.out.println("A Grade");
		}
		else if(percentage <= 60 && percentage >= 40) {
			System.out.println("B Grade");
		}
		else
			System.out.println("Fail");
		

	}

}
