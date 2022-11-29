package polymorphism;

public class Addition {
	
	void add(int a, int b)
	{
		System.out.println("addition of 2 int is "+(a+b));
	}
	
	void add(int a, int b, int c)
	{
		System.out.println("addition of 2 int is "+(a+b));
	}
	
	void add(String a, int b)
	{
		System.out.println("addition of String and int is "+(a+b));
	}
	
	void add(String a, String b)
	{
		System.out.println("addition of 2 strings is "+(a+b));
	}
	
	void add(float a, int b)
	{
		System.out.println("addition of float and int is "+(a+b));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addition a1 = new Addition();
		a1.add(10, 20);
		a1.add("abs", 15);
		a1.add(20, 56, 2);

	}

}
