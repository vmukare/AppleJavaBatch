package PatternAssignments;

public class Pattern_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows=5;
    	for(int i=rows; i>=1; i--)
		{
			for (int j=rows; j>i; j--)
			{
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++)
			{
				System.out.print(j);
			}
			
				for(int j=rows-1; j>=1; j--)
				{
					System.out.print(j);
				}
				System.out.println();
			
		}
		
	}

}
