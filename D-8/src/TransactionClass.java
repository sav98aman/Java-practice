public class TransactionClass {

    public static void main(String[] args) {
        HdfcBank hdfcBank=new HdfcBank(1,"ama123");
        //SbiBank sbiBank=new SbiBank();
        System.out.println(hdfcBank.branchCode);
        hdfcBank.withdraw(100);
        hdfcBank.displayBalance();

        ModelClass modelobj=new ModelClass(" 'Aman kumar verma' "," 'Theta' 'jehanabad' 'Bihar' '804427' ");
        System.out.println(modelobj);



        if(hdfcBank instanceof Bank){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
    }
}
