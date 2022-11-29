package classedAndObjects;

public class ConstructorChain {
	
	 ConstructorChain()
	 {
		 this(10,20,30);
		 System.out.println("simple constructor");
	 }
	 ConstructorChain(int x)
	 {
		 this(10,20);
		 System.out.println("one parameter constructor");
	 }
	 ConstructorChain(int c, int y)
	 {
		 System.out.println("two parameter constructor");
	 }
	 ConstructorChain(int x, int y, int z)
	 {
		 System.out.println("three parameter constructor");
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ConstructorChain c1 = new ConstructorChain();

	}

}
