 package forLooping;

import java.util.Scanner;

public class ArmstrongNumber {
	
//armstrongNumber = 153 = 1^3 + 5^3 + 3^3 ...if this equation is satisfy then the number is called as armstrong number
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num , cnt = 0 , sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr number to check: ");
		num = sc.nextInt();
		int temp = num;
		
		//to check the count of number...
		while(temp != 0)
		{
			cnt++;
			temp = temp / 10;
		}
		
		temp = num;
		//to calculate power...
		while(temp != 0)
		{
			int power = 1;
			int r = temp % 10;
			
			for(int i=1; i<=cnt; i++)//calculate power 
			{
				power = power * r;
			}
			sum = sum + power;
  			temp = temp/10;
		}
		
		//to print the output
		if(sum == num)
			System.out.println("The number "+num+" is Armstrong number");
		else
			System.out.println("The number "+num+" is not Armstrong number");
	}

}
