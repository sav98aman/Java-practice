public class Bank{
	static int totalbankblance=0;
	String name="";
	int userBalance=0;
	int accno=0;
	int mobile=0;
	
	void createAccount(String userName,int balance,int accNo,int mobileNum){
		name=userName;
		userBalance=balance;
		accno=accNo;
		mobile=mobileNum;
	}
	
	void displayAccount(){
		System.out.println("\n Name = "+name);
		System.out.println("\n Balance = "+userBalance);
		System.out.println("\n Accounts No = "+accno);
		System.out.println("\n Mobile = "+mobile);
	}
	
	void displayTotalBalnced(){
		System.out.println("\n Total Bank Balance= "+totalbankblance);
	}
	
	public static void main(String[] args){
		Bank Aman=new Bank();
		Aman.createAccount(userName:"Aman kumar", balance:100, accNo:91776869852, mobileNum:7761769852);
		Aman.displayAccount();
	}
	
}