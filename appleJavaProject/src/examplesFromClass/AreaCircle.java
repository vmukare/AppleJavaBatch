package examplesFromClass;
import java.util.Scanner;

public class AreaCircle {
	public static void main(String args[]) {
		float area,redius;
		float pi = 3.14f;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the valur of redius: ");
		redius = sc.nextFloat();
		area = pi * redius * redius;
		System.out.println("Area of circle is: "+area);
	}

}
