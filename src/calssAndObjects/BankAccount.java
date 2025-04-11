package calssAndObjects;
// 5.	Create a class named BankAccount with an instance variable balance.
// Create an object and assign an initial balance of 1000. Print the balance.

public class BankAccount {

    double balance ;

    public static void main(String[] args) {

        BankAccount Account =  new BankAccount();
        Account.balance =  10200.0;

        System.out.println("balance : "+Account.balance+ " Rs");
    }
}
