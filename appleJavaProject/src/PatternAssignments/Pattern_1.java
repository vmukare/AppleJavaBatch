package PatternAssignments;

public class Pattern_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows=5;
		for(int i=rows; i>=1; i--)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
