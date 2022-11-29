package starPatterns;

public class Pattern_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 0;                       //x=0             x=1z		
		for(int i=1; i<=5; i++)          //i=1       i=1
		{                                //
			for(int j=1; j<=i+x; j++)    //j=1 j=2   j=1 j=2 j=3
			{                               
				System.out.print(j+" ");//1
			}                           //1 2
			x = x + 1;//x=1
			System.out.println();//1
		}   
		int y=7;
		 for(int i=4  ; i>=1; i--)
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
