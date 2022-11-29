package polymorphism;

public class Shapes {
	void area(int l, int b)
	{
		System.out.println("area of rectangle is "+(l*b));
	}
	
	void area(float r)
	{
		float pi=3.14f;
		System.out.println("area of circle is "+(pi*r*r));
	}
	
	void area(float b, int h)
	{
		System.out.println("area of triangle is "+(b*h)/2);
	}
	
	void area(int s)
	{
		System.out.println("area of square is "+(s*s));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shapes s1 = new Shapes();
		s1.area(3.5f);
		s1.area(20);
		s1.area(5.6f, 25);
		s1.area(20, 25);

	}

}
