import java.util.ArrayList;
import java.util.Scanner;

public class AsusBank {

    static double balance = 0;
    static String userPIN = "1234";   // default pin
    static ArrayList<String> history = new ArrayList<>();


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // LOGIN SYSTEM
        System.out.print("Enter PIN to login: ");
        String pin = sc.nextLine();

        if (!pin.equals(userPIN)) {
            System.out.println("❌ Wrong PIN! Access Denied.");
            return;
        }

        System.out.println("✔ Login Successful!\n");

        int choice;

        do {
            System.out.println("\n====== ASUS BANK MENU ======");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Transfer Money");
            System.out.println("5. View Transaction History");
            System.out.println("6. Calculate Interest");
            System.out.println("7. Change PIN");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    deposit(sc);
                    break;
                case 2:
                    withdraw(sc);
                    break;
                case 3:
                    checkBalance();
                    break;
                case 4:
                    transfer(sc);
                    break;
                case 5:
                    viewHistory();
                    break;
                case 6:
                    interestCalculator(sc);
                    break;
                case 7:
                    changePIN(sc);
                    break;
                case 8:
                    System.out.println("Are you sure you want to exit? (yes/no)");
                    sc.nextLine();
                    String confirm = sc.nextLine();
                    if (!confirm.equalsIgnoreCase("yes")) {
                        choice = 0;   // Cancel exit
                    } else {
                        System.out.println("Thank you for using ASUS Bank!");
                    }
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }

        } while (choice != 8);

        sc.close();
    }


    // Deposit Function
    static void deposit(Scanner sc) {
        System.out.print("Enter amount to deposit: ");
        double amount = sc.nextDouble();

        if (amount > 0) {
            balance += amount;
            System.out.println("₹" + amount + " deposited successfully.");
            history.add("Deposited: ₹" + amount);
        } else {
            System.out.println("Invalid amount!");
        }
    }


    // Withdraw Function
    static void withdraw(Scanner sc) {
        System.out.print("Enter amount to withdraw: ");
        double amount = sc.nextDouble();

        if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else if (amount <= 0) {
            System.out.println("Invalid amount!");
        } else {
            balance -= amount;
            System.out.println("₹" + amount + " withdrawn successfully.");
            history.add("Withdrawn: ₹" + amount);
        }
    }


    // Check Balance Function
    static void checkBalance() {
        System.out.println("Current Balance: ₹" + balance);
    }


    // Transfer Money Function
    static void transfer(Scanner sc) {
        System.out.print("Enter receiver account number: ");
        String acc = sc.next();

        System.out.print("Enter amount to transfer: ");
        double amount = sc.nextDouble();

        if (amount > balance) {
            System.out.println("Insufficient funds!");
        } else if (amount <= 0) {
            System.out.println("Invalid amount!");
        } else {
            balance -= amount;
            System.out.println("₹" + amount + " transferred to " + acc);
            history.add("Transferred ₹" + amount + " to Account: " + acc);
        }
    }


    // Transaction History
    static void viewHistory() {
        System.out.println("\n==== TRANSACTION HISTORY ====");
        if (history.isEmpty()) {
            System.out.println("No transactions yet!");
        } else {
            for (String h : history) {
                System.out.println("- " + h);
            }
        }
    }


    // Interest Calculator
    static void interestCalculator(Scanner sc) {
        System.out.print("Enter rate of interest (%): ");
        double rate = sc.nextDouble();

        System.out.print("Enter time (years): ");
        double time = sc.nextDouble();

        double interest = (balance * rate * time) / 100;
        System.out.println("Interest Earned: ₹" + interest);

        history.add("Interest calculated: ₹" + interest);
    }


    // Change PIN
    static void changePIN(Scanner sc) {
        sc.nextLine();
        System.out.print("Enter current PIN: ");
        String oldPin = sc.nextLine();

        if (!oldPin.equals(userPIN)) {
            System.out.println("Incorrect PIN!");
            return;
        }

        System.out.print("Enter new PIN: ");
        String newPin = sc.nextLine();

        userPIN = newPin;
        System.out.println("PIN updated successfully!");
    }

}
