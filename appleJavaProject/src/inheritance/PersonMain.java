package inheritance;

public class PersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Address a1 = new Address("karve nagar", "pune", "maharashtra", 415456);
		
		Person p1 = new Person(111, "john", "987654321", "john@gmail.com", a1);
		
		System.out.println(p1);
		
		Address a2 = new Address("shivshakti nagar", "barshi", "maharashtra", 413411);
		Person p2 = new Person(123, "jack", "895647125", "jack@gmail.com", a2);
		System.out.println("-----------*-------*----------*------------*-----------*-----------*------------*-----------");
		System.out.println(p2);
		

	}

}
