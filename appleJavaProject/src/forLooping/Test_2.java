package forLooping;

public class Test_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1; i<=3; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(j);
			}
			for(int k=i; k<5-i; k++)
			{
				System.out.print(" ");
			}
			for(int h=i; h>=1; h--)      //1___5
			{                            //12_45
				if(h==3)                 //12345
				{
					continue;
				}
				int g=6;
				System.out.print(g-h);
				g--;
			}
			System.out.println();
		}
	}

}
