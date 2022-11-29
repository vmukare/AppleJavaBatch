package starPatterns;

public class Pattern_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i,j,row=6;
		for(i=0; i<row; i++)
		{
			for(j=row-i; j>1; j--)
			{
				System.out.print(" ");
			}
			for(j=0; j<=i; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for(i=1; i<=5; i++)
		{
			for(j=1; j<=i; j++)
			{
				System.out.print(" ");
			}
			for(j=5; j>=i; j--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
//      * 
//     * * 
//    * * * 
//   * * * * 
//  * * * * * 
// * * * * * * 
//  * * * * *
//   * * * *
//    * * *
//     * *
//      *