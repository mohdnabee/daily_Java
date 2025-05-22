package Encapsulation;

class  BankAccount{
    private String accountNumber ;
    private  double balance ;

    //  setter method
    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }

    public String getAccountNumber(){
        return accountNumber;
    }

    public  double  getBalance(){
        return balance;
    }

    public  void deposit(double amount){
        if (amount > 0)
            balance +=  amount;
    }

    public  void withdraw (double amount){
        if (amount >  0  && amount <=  balance){
            balance -= amount;
        }
    }

}

public class bankECS {
    public static void main(String[] args) {

        BankAccount account =  new BankAccount();
        account.setAccountNumber("1245BECS23456");
        account.deposit(12000);
        account.withdraw(4000);

        System.out.println("Account Number : "+ account.getAccountNumber());
        System.out.println("Balance : "+account.getBalance());


    }
}
