package staticVariable;

import classedAndObjects.ToStringMethod;

public class PuneCollege {
	
	int id,dno,studno;
	String name,location;
	static String state = "Maharashtra";
	static String uniname = "pune university";
	
	PuneCollege()
	{
		id = 12;
		dno = 5;
		studno = 700;
		name = "DY patil college";
		location = "akurdi";
	}
	
	public String toString()
	{
		return id+" "+dno+" "+studno+" "+name+" "+location;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PuneCollege c1 = new PuneCollege();
		System.out.println(c1);
		System.out.println(PuneCollege.uniname+" "+PuneCollege.state);
		ToStringMethod.main(null);//calling main function of another file or class

	}

}
