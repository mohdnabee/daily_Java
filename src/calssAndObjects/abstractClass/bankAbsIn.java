package calssAndObjects.abstractClass;

// Write an abstract class BankAccount with a method calculateInterest().
// Extend it with SavingsAccount and CurrentAccount to provide different interest calculations.

//  abstract class
// Abstract class
abstract class BankAccount {
    double balance;

    BankAccount(double balance) {
        this.balance = balance;
    }

    // Abstract method
    abstract void calculateInterest();
}

// Subclass 1
class SavingsAccount extends BankAccount {
    SavingsAccount(double balance) {
        super(balance);
    }

    @Override
    void calculateInterest() {
        double interest = balance * 0.05;
        System.out.println("Savings Account Interest: " + interest);
    }
}

// Subclass 2
class CurrentAccount extends BankAccount {
    CurrentAccount(double balance) {
        super(balance);
    }

    @Override
    void calculateInterest() {
        double interest = balance * 0.02;
        System.out.println("Current Account Interest: " + interest);
    }
}

public class bankAbsIn {
    public static void main(String[] args) {
        BankAccount savings = new SavingsAccount(10000);
        BankAccount current = new CurrentAccount(10000);

        savings.calculateInterest();
        current.calculateInterest();

    }
}
