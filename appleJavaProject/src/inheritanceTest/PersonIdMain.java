package inheritanceTest;

import java.util.Scanner;

public class PersonIdMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IdProof i = new IdProof();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter ID: ");
		int id = sc.nextInt();
		System.out.println("enter person name: ");
		String pName = sc.next();
		System.out.println("enter contact number: ");
		String contact = sc.next();
		System.out.println("enter address: ");
		String address = sc.next();
		System.out.println("enter Id name: ");
		String name = sc.next();
		System.out.println("enter Id number: ");
		int number = sc.nextInt();
		System.out.println("enter validity: ");
		String validity = sc.next();
		
		i.setId(id);
		i.setPName(pName);
		i.setContact(contact);
		i.setAddress(address);
		i.setName(name);
		i.setNumber(number);
		i.setValidity(validity);
		
		i.display();

	}

}
