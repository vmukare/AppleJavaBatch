package PatternAssignments;

public class Pattern_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows=5,x=0;
		for(int i=1; i<=rows; i++)
		{
			for(int j=1; j<=x+i; j++)
			{
				System.out.print(j+" ");
			}
			x=x+1;
			System.out.println();
		}
		int y=7;
		for(int i=4; i>=1; i--)
		{
			for(int j=1; j<=y; j++)
			{
				System.out.print(j+" ");
			}
			y=y-2;
			System.out.println();
		}

	}

}
