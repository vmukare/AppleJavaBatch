package test_4;

public class CopyValues {
	
	int number;
	String name;
	
	CopyValues(int number, String name)
	{
		this.number = number;
		this.name = name;
	}
	
	CopyValues(CopyValues c)
	{
		number = c.number;
		name = c.name;
	}
	
	void display()
	{
		System.out.println(number+" "+name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CopyValues c1 = new CopyValues(123, "john");
		CopyValues c2 = new CopyValues(c1);
		
		c1.display();
		c2.display();

	}

}
           