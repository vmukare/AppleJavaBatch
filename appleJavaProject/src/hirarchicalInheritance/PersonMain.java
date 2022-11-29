package hirarchicalInheritance;

public class PersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1 = new Student();
		s1.setId(101);
		s1.setName("john");
		s1.setAge(24);
		s1.setContact("987456321");
		s1.setCollege("sveri");
		s1.setPercentage(86f);
		s1.display();
		s1.grade();
		
		System.out.println("------------------*********----------------------");
		
		Faculty f1 = new Faculty();
		f1.setId(102);
		f1.setName("ram");
		f1.setContact("8974568321");
		f1.setAge(32);
		f1.setSubject("english");
		f1.setSalary(50000);
		f1.display();
		f1.calculatePf();
		

	}

}
