package calssAndObjects;
// 5.	Create a class named BankAccount with an instance variable balance.
// Create an object and assign an initial balance of 1000. Print the balance.

public class BankAccount {

    double balance ;
    String accountHolder;

    public static void main(String[] args) {

        BankAccount Account =  new BankAccount();
        Account.balance =  60200.0;
        Account.accountHolder = "ASUS TUF GAMING F15";


        System.out.println("balance : "+Account.balance+ " Rs");
        System.out.println("Account Holder Name : "+Account.accountHolder);
    }
}
