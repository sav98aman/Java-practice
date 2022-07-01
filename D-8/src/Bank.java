public class Bank {
    String accNo="099931234";
    String branchCode="hdfc123456";
    String branchName="hdfc Jehanabad";

    Bank(String branchCode){
        this.branchCode=branchCode;
    }



    void displayBalance(){
        System.out.println(branchCode);
    }
    void withdraw(int amount){
        System.out.println("Your money is taken "+amount);
    }
}
