package starPatterns;

public class Pattern_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(char i='D'; i>='A'; i--)
		{
			for(char j='A'; j<=i; j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		for(char i='A'; i<='F'; i++)
		{
			for(char j='A'; j<=i; j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
//     A B C D
//     A B C
//     A B
//     A
//     A
//     A B
//     A B C
//     A B C D
//     A B C D E
//     A B C D E F
