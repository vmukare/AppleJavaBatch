package inheritance.parentChild;

public class MyTime extends MyDate{
	
	int hrs,min,sec;
	

	public int getHrs() {
		return hrs;
	}


	public void setHrs(int hrs) {
		this.hrs = hrs;
	}


	public int getMin() {
		return min;
	}


	public void setMin(int min) {
		this.min = min;
	}


	public int getSec() {
		return sec;
	}


	public void setSec(int sec) {
		this.sec = sec;
	}

	void display()
	{
		System.out.println(getHrs()+":"+getMin()+":"+getSec()+"\n"+getDd()+"/"+getMm()+"/"+getYy());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
