public class HdfcBank   extends Bank {
    int interestRate;
    String homeLone;
    String offerCard;

    HdfcBank(int interestRate,String branchCode){
        super(branchCode);
        interestRate=interestRate;
    }
    void getYourPA(){

    }
    @Override
    void withdraw(int amount){
        if (amount>0){
            super.withdraw(amount);
        }

    }
}
