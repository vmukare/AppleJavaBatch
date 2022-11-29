package inheritanceAssignment;

public class PersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Address a1 = new Address();
		a1.setArea("shivaji nagar");
		a1.setCity("pune");
		a1.setState("maharashtra");
		a1.setPincode(452145);
		
		Person p1 = new Person();
		p1.setId(101);
		p1.setName("john");
		p1.setContact("987456321");
		p1.setEmail("john@gmail.com");
		p1.setAdd(a1);
		
		System.out.println(p1);
		
		Address a2 = new Address();
		a1.setArea("karve nagar");
		a1.setCity("pune");
		a1.setState("maharashtra");
		a1.setPincode(452145);
		
		Person p2 = new Person();
		p1.setId(102);
		p1.setName("jack");
		p1.setContact("985456321");
		p1.setEmail("jack@gmail.com");
		p1.setAdd(a2);

		System.out.println(p2);
	}

}
