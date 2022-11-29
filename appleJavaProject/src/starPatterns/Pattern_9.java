package starPatterns;

public class Pattern_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows=7;
		for(int i=1; i<=rows; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(j+" ");
			}
			for(int j=i-1; j>=1; j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}

	}

}
