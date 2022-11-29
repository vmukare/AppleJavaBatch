package overriding;

public class Patient extends Person {
	
	int id,bedNo;
	String disease;
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setBedNo(int bedNo) {
		this.bedNo = bedNo;
	}
	
	public void setDisease(String disease) {
		this.disease = disease;
	}
	
	void display()
	{
		super.display();
		System.out.println("Patient id: "+id+"\n"+"bed number: "+bedNo+"\n"+"Disease: "+disease);
	}

}
