package calssAndObjects;
//15.	Create a class named Bank with a static variable bank_name and an instance variable account_holder.
// Create 2 objects and print the bank name and account holder names.
public class Bank {

    static  String bank_name =  "Bank of India ";
    String account_holder;

    public static void main(String[] args) {

        Bank bank =  new Bank() ;
        bank.account_holder="Mohd Nabeel";

        System.out.println("Bank Name : "+Bank.bank_name);
        System.out.println("Account Holder : "+bank.account_holder);
    }
}
