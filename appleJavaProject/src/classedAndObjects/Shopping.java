package classedAndObjects;

import java.util.Scanner;

public class Shopping {
	String purchaseItemName;
	int quantity,price,bill;
	Scanner sc = new Scanner(System.in);
	
	void acceptDetails()
	{
		System.out.println("enter item name: ");
		purchaseItemName = sc.nextLine();
		System.out.println("enter item price" );
		price = sc.nextInt();
		System.out.println("how much quantity you want: ");
		quantity = sc.nextInt();
	}
	
	void calculateBill()
	{
		
		 bill = price * quantity;
		
	}
	void display()
	{
		System.out.println("*********your shopping details***********");
		System.out.println(purchaseItemName);
		System.out.println(quantity);
		System.out.println(price);
		if(quantity>0) {
		System.out.println("total bill "+bill);
		}
		else {
			System.out.println("error....");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shopping s = new Shopping();
		s.acceptDetails();
		s.calculateBill();
		s.display();
		
		
		
				

	}

}
