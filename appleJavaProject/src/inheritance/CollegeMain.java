package inheritance;

public class CollegeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Department d1 = new Department();
		d1.setId(4);
		d1.setName("computer");
		
		Library l1 = new Library();
		l1.setNoOfBooks(1000);
		l1.setIncharge("Mr.vibhute");
		
		College c1 = new College();
		c1.setCode(12345);
		c1.setName("SVERI");
		c1.setAddress("pandharpur");
		c1.setDept(d1);
		c1.setLib(l1);
		System.out.println(c1);

	}

}
