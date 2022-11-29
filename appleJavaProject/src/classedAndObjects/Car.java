package classedAndObjects;

import java.util.Scanner;

public class Car {
	
	 int speed,price;
	  String name,color,mop;
	  
	  void setData()
	  {
		  Scanner sc = new Scanner(System.in);
		  
		  System.out.println("Enter the name of car: ");
		  name = sc.next();
		  
		  System.out.println("Enter the color of car: ");
		  color= sc.next();
		  
		  System.out.println("Enter the price of car: ");
		  price = sc.nextInt();
		  
		  System.out.println("Enter the speed of car: ");
		  speed = sc.nextInt();
		  
		  System.out.println("What is the payment mode(online/cash): ");
		  mop = sc.next();
	  }
	  
	  void discount()
	  {
		  float discount;
		  if(mop.equalsIgnoreCase("online"))
		  {
			  discount = price * 0.001f;
		  }
		  else
		  {
			  discount = price * 0.002f;
		  }
		  
		  float total = price - discount;
		  System.out.println("total discount: "+discount);
		  System.out.println("total price: "+total);
	  }
	  
	  void display()
	  {
		  System.out.println(name+" "+color+" "+price+" "+speed+" "+mop);
	  }

	public static void main(String[] args) {
		  
		 Car c = new Car();
		 c.setData();
		 c.display();
		 c.discount();
		
		  
		
		  

	}

}
