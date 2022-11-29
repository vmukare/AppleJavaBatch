package starPatterns;

public class PatterB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(char i='a'; i<='e'; i++)
		{
			for(char j='e'; j>=i; j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
//e d c b a 
//e d c b 
//e d c 
//e d 
//e 