package examplesFromClass;
import java.util.Scanner;

public class Areas {
	public static void main(String args[]) {
		int type;
		Scanner sc = new Scanner(System.in);
		System.out.println("1-circle,2-rectangle,3-triangle");
		System.out.println("which area do you want: ");
		type = sc.nextInt();
		
		if(type == 1) {
			float area,R;
			float pi = 3.14f;
			Scanner n = new Scanner(System.in);
			System.out.println("enter the redius: ");
			R = n.nextFloat();
			area = pi * R * R;
			System.out.println("Area of circle is: "+area);
		}
		
		else if(type == 2) {
			float area1,l,w;
			Scanner scan = new Scanner(System.in);
			System.out.println("enter the value of length:");
			l = scan.nextFloat();
			System.out.println("enter the value of width: ");
			w = scan.nextFloat();
			area1 = l * w;
			System.out.println("area of rectangle: "+area1);
		}
		
		else if(type == 3) {
			float area2,B,H;
			Scanner scann = new Scanner(System.in);
			System.out.println("enter the value of breadth: ");
			B = scann.nextFloat();
			System.out.println("enter the value of length: ");
			H = scann.nextFloat();
			area2 = (B * H) / 2;
			System.out.println("area of triangle: "+area2);
		}
		else {
			System.out.println("enter valid type");
		}
		sc.close();
	}

}
