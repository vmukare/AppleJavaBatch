package starPatterns;

public class Pattern_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		for(i=1; i<=5; i++)
		{
			for(j=1; j<i; j++)
			{
				System.out.print(" ");
			}
			for(j=i; j<=5; j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		for(i=1; i<=4; i++)
		{
			for(j=4; j>i; j--)
			{
				System.out.print("_");
			}
			for(j=1; j>i; j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();
			
		}

	}

}
//1 2 3 4 5
// 2 3 4 5
//  3 4 5
//   4 5
//    5
//   4 5
//  3 4 5
// 2 3 4 5
//1 2 3 4 5