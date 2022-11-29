package starPatterns;

public class Pattern_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(char i='A'; i<='F'; i++)
		{
			for(char j='F'; j>=i; j--)
			{
				System.out.print(" ");
			}
			for(char k='A'; k<=i; k++)
			{
				System.out.print(k+" ");
			}
			System.out.println();
		}

	}

}
//       A 
//      A B 
//     A B C 
//    A B C D 
//   A B C D E 
//  A B C D E F 
