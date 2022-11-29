package starPatterns;

public class PatternA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		for(char i='e'; i>='a'; i--)
		{
			for(char j='e'; j>i; j--)
			{
				System.out.print(" ");
			}
			for(char k='a'; k<=i; k++)
			{
				System.out.print(k);
			}
			System.out.println();
		}
		
		for(int i=5; i>=1; i--)
		{
			for(int j=5; j>i; j--)
			{
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++)
			{
				System.out.print(k  );
			}
			System.out.println();
		}
	}

}
//abcde
// abcd
//  abc
  // ab
    //a
