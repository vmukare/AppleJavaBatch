package hirarchicalInheritance;

public class FamilyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Son s1 = new Son();
		s1.setName("john");
		s1.setAge(25);
		s1.setHobby("writing");
		
		System.out.println(s1.getName()+" "+Son.surname+" "+s1.getAge()+" "+s1.getHobby());

		Daughter d = new Daughter();
		d.setName("lily");
		d.setAge(23);
		d.setHobby("Drawing");
		
		System.out.println(d.getName()+" "+Daughter.surname+" "+d.age+" "+d.getHobby());
	}

}
