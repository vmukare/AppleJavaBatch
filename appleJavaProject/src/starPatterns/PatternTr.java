package starPatterns;

public class PatternTr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(char i='a'; i<='d'; i++)
		{
			for(char j='a'; j<=i; j++)
			{
				System.out.print(" ");
			}
			for(char k=i; k<='d'; k++)
			{
				System.out.print(k+" ");
			}
			System.out.println();
		}

	}

}
//a b c d
// a b c
//  a b
//   a