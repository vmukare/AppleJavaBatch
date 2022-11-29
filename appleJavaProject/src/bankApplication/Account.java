package bankApplication;

public class Account {
	  private int accNo,accBalance;
	  private String accHolderName;
	  
	  void setAccNo(int accNo)
	  {
		  this.accNo=accNo;
	  }
	  int getAccNo()
	  {
		  return accNo;
	  }
	  
	  void setAccBalance(int accBalance)
	  {
		  this.accBalance=accBalance;
	  }
	  int getAccBalance()
	  {
		  return accBalance;
	  }
	  
	  void setAccHolderName(String accHolderName)
	  {
		  this.accHolderName=accHolderName;
	  }
	  String getAccHolderName()
	  {
		  return accHolderName;
	  }

}
