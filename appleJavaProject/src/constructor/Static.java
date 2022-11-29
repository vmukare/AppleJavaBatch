package constructor;

public class Static {
	
	 int count;
	
	Static()
	{
		count++;
	}
	void display()
	{ 
		System.out.println(count);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Static s1 = new Static();
		s1.display();
		Static s2 = new Static();
		s2.display();
		
	}

}
