import java.util.Scanner;

public class AsusBank {

    //  Global balance variable
    static double balance = 0;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;


        //  Using a Do-While
        do {
            System.out.println("\n==== ASUS BANK MENU ====");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

//             inside the do-while using the switch
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
                    System.out.println("Thank you for using Asus Bank!!");
                    break;
            }


        } while (choice != 4);
        sc.close();


    }


// Function Deposit
static void deposit(Scanner sc){
    System.out.print("Enter amount to deposit: ");
    double amount =  sc.nextDouble();

    if (amount >0){
        balance += amount ;
        System.out.println("₹" + amount +" deposited successfully");
//        checkBalance();
    }else {
        System.out.println("Invalid amount !!!");
    }
}


// Function WithDraw
    static void withdraw(Scanner sc){
        System.out.print("Enter amount to withdraw: ");
        double amount = sc.nextDouble();

        if(amount > balance){
            System.out.println("Insufficient balance!");
        }else if (amount <= 0){
            System.out.println("Invalid amount!");
        }else {
            balance -= amount ;
            System.out.println("₹" + amount + " withdrawn successfully!");
        }
    }

// Function CheckBalance
    static void checkBalance() {
        System.out.println("Current Balance: ₹" + balance);
    }

}