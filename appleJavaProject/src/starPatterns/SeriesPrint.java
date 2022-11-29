package starPatterns;

public class SeriesPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int j = 1;
		for(int i=1; i<=6; i++)
		{
			System.out.print(j+" ");
			j = j+(i*i);
		}
		System.out.println();
		int k=4,l=1;
		for(int i=1; i<=6; i++)
		{
			System.out.print(l+" ");
			l = l +(k*i);
		}

	}

}
