package forLooping;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row=3;
		for(int i=1; i<=row; i++)
		{
			for(int j=1; j<=row-i; j++)
			{
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++)
			{
				if(j==i)
					break;
				System.out.print("*");
			}
			System.out.print(i);
//			for(int j=1; j<=i; j++)
//			{
//				if(j==i)
//				System.out.print(j);
//			}
			for(int j=1; j<=i; j++)
			{
				if(j==i)
					break;
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
