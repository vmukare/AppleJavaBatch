package inheritance;

public class Department {
	
	private int id;
	private String name;
	
	
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

	public String toString()
	{
		return id+" "+name;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
