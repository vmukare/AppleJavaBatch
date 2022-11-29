package bankApplication;

import java.util.Scanner;

public class Transactions {
	
	void deposit(int amount, Account ac)
	{
		int acBal = ac.getAccBalance();
		acBal = acBal + amount;
		ac.setAccBalance(acBal);
	}
	
	void withdraw(int amount, Account acc)
	{
		int bal = acc.getAccBalance();
		bal = bal - amount;
		acc.setAccBalance(bal);
	}
	
	void displayForDeposite(Account a)
	{
		System.out.println(a.getAccHolderName()+" your amount is doposited successfully!!!");
		System.out.println("Account balance: "+a.getAccBalance());
	}
	
	void displayForWithdraw(Account b)
	{
		System.out.println(b.getAccHolderName()+" your amount is withdrawn successfully!!!");
		System.out.println("Account balnce: "+b.getAccBalance());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a1 = new Account();
		System.out.println("select the operation to perform:\n 1) Deposit\n 2)withdraw\n 3)check balance");
		Scanner sc = new Scanner(System.in);
		int operation = sc.nextInt();
		
		Transactions t1 = new Transactions();
		
		switch(operation)
		{
			case 1:
				System.out.println("Please enter your account number: ");
				int accNo = sc.nextInt();
				a1.setAccNo(accNo);
				a1.setAccBalance(50000);
				a1.setAccHolderName("john doe");
				System.out.println("enter amount in rupees to diposit: ");
				int amt = sc.nextInt();
				t1.deposit(amt, a1);
				t1.displayForDeposite(a1);
				
			case 2:
				System.out.println("Please enter your account number: ");
				int acNo = sc.nextInt();
				a1.setAccNo(acNo);
				a1.setAccBalance(40000);
				a1.setAccHolderName("Vaibhav");
				System.out.println("enter amount in rupees to withdraw: ");
				int amt1 = sc.nextInt();
				t1.withdraw(amt1, a1);
				t1.displayForWithdraw(a1);
				
				
		}
		
		
		
	
		
		

	}

}
