package classedAndObjects;

import java.util.Scanner;

public class SumOfFactors {
	void sum(int num) {
		int sum=0;	
		for(int i=1; i<=num; i++)
		{
			if(num % i == 0)
			{
				sum = sum+i;
			}
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumOfFactors s1 = new SumOfFactors();
		s1.sum(12);

	}

}
