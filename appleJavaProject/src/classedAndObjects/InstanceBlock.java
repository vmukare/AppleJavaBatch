package classedAndObjects;

public class InstanceBlock {
	int a;
	String name;
	{
		System.out.println("instance block 1........");
		 a= 10;
		 name = "vaibhav";
		 display();
	}
	
	{
		System.out.println("instance block 2............");
		 a=20;
		 name = "mukare";
		 display();
	}
	
	InstanceBlock()
	{
		 a=30;
		 name = "abcd";
		 display();
	}
	void display()
	{
		System.out.println(a+" "+name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InstanceBlock m1 = new InstanceBlock();
		m1.display();
	}

}
