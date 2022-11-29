package overriding;

public class Doctor extends Person{

	int id,license;
	String specialization;
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setLicense(int license) {
		this.license = license;
	}
	
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	
	void display()
	{
		super.display();
		System.out.println("Doctor ID: "+id+"\n"+"license number: "+license+"\n"+"specialization of doctor: "+specialization);
	}
	
}
