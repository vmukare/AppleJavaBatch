package classedAndObjects;

public class StaticBlock {
	
	int a =10;
	static int b = 20;
	//static can be execute before main method
	static
	{
		System.out.println(b);
	}
	static
	{
		b++;
		System.out.println("static 2");
	}
	static
	{
		System.out.println("ststic 3");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(b);
	}

}
