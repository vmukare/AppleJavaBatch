package polymorphism;

import java.util.Scanner;

public class GooglePay {
	
	void withdraw(int amount, Account acc)
	{
		int acBal = acc.getBalance();
		if(acBal > amount)
		{
			acBal = acBal - amount;
			acc.setBalance(acBal);
		}
		else
			System.out.println("low balance");
	}
	
	void deposit(int amount, Account ac)
	{
		int acBal = ac.getBalance();
		acBal = acBal+amount;
		ac.setBalance(acBal);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a1 = new Account();
		a1.setId(101);
		a1.setNumber(123456);
		a1.setBalance(50000);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter ammount to withdraw: ");
		int amt = sc.nextInt();
		
		GooglePay g = new GooglePay();
		g.withdraw(amt, a1);
		System.out.println("amount withraw and remaining balance is: "+a1.getBalance());
		
		Account a2 = new Account();
		a2.setId(101);
		a2.setNumber(54321);
		a2.setBalance(70000);
		System.out.println("enter amount to diposit");
		int amt1 = sc.nextInt();
		
		g.deposit(amt, a2);
		System.out.println(a2.getBalance());

	}

}
