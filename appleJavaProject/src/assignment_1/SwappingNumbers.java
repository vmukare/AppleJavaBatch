package assignment_1;

public class SwappingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 20;
		
		//swapping without using third variable
		
//		a = a + b;
//		b = a - b;
//		a = a - b;
//		System.out.println(a);
//		System.out.println(b);
		
		//swapping using third variable
		
		int c;
		c = a;
		a = b;
		b = c;
		System.out.println(a);
		System.out.println(b);

	}

}
