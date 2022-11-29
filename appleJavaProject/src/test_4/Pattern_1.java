package test_4;

public class Pattern_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int row = 9;
		for(int i=row; i>=1; i--)
		{
			for(int j=i; j>=1; j--)
			{
				System.out.print(" ");
			}
			for(int j=i; j<=row; j++)
			{
				System.out.print(j);
			}
			for(int j=row-1; j>=i; j--)
			{
				
				System.out.print(j);
			}
			System.out.println();
		}

	}

}
