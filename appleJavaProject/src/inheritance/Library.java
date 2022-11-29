package inheritance;

public class Library {
	
	private int noOfBooks;
	private String incharge;
	
	public int getNoOfBooks() {
		return noOfBooks;
	}
	public void setNoOfBooks(int noOfBooks) {
		this.noOfBooks = noOfBooks;
	}
	public String getIncharge() {
		return incharge;
	}
	public void setIncharge(String incharge) {
		this.incharge = incharge;
	}

	public String toString()
	{
		return noOfBooks+" "+incharge;
	}
}
