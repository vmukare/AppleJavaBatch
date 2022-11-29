package test_3;

import java.util.Scanner;

public class Box {
	
	void volume() {
		int l , w , h;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the length of box: ");
		l = sc.nextInt();
		System.out.println("enter the width of box: ");
		w = sc.nextInt();
		System.out.println("enter the height of box: ");
		h = sc.nextInt();
		System.out.println("volume of the box is = " + (l*w*h));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box b1 = new Box();
		b1.volume();

	}

}
