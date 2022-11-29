package overriding;

public class PersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("                     Doctor information          \n ");
		Doctor d1 = new Doctor();
		d1.setId(100);
		d1.setName("john");
		d1.setAge(45);
		d1.setGender("male");
		d1.setContact("8975485464");
		d1.setLicense(654869454);
		d1.setSpecialization("neurologist");
		d1.display();
		
		System.out.println("------------------*****----------------");
		System.out.println("                    Patient information          \n ");
		
		Patient p1 = new Patient();
		p1.setId(100);
		p1.setName("keshav");
		p1.setBedNo(24);
		p1.setGender("male");
		p1.setAge(24);
		p1.setContact("9845758478");
		p1.setDisease("Head ache");
		p1.display();

	}

}
