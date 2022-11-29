package inheritanceAssignment;

public class Person {
	
	private int id;
	private String name,contact,email;
	private Address add;
	
	public void setAdd(Address add)
	{
		this.add=add;
	}
	public Address getAdd()
	{
		return add;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String toString()
	{
		return id+" "+name+" "+contact+" "+email+"\n"+add;
	}

}
