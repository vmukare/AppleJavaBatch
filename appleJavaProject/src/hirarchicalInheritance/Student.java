package hirarchicalInheritance;

public class Student extends Person {
	
	float percentage;
	String college;
	
	
	
	public float getPercentage() {
		return percentage;
	}

	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	void grade()
	{
		if(percentage > 70)
		{
			System.out.println("distinction");
		}
		else if(percentage < 70)
		{
			System.out.println("first class");
		}
		else if(percentage < 50)
		{
			System.out.println("fail");
		}
	}
	
	void display()
	{
		System.out.println("Student id: " + getId() + "\n" + "Student name: " + getName() + "\n" + "Student age: "
				+ getAge() + "\n" + "College Name: " + getCollege() + "\n" + "percentage: "+getPercentage());
	}
}
