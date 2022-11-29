package starPatterns;

public class PatternAB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1; i<=4; i++)
		{
			for(int j=1; j<2*i; j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
//1
//123
//12345
//1234567