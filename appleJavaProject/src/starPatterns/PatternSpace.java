package starPatterns;

public class PatternSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row=6;
		for(int i=1; i<=row; i++)
		{
			for(int j=2*(row-i); j>=0; j--)
			{
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
