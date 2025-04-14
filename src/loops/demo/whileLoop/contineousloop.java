package loops.demo.whileLoop;

import java.util.Scanner;

public class contineousloop {


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            double balance = 10000;
            boolean running = true;

            while (running) {
                System.out.println("Welcome to the Mart!");
                System.out.println("Your balance: $" + balance);
                System.out.println("1. Smart Phones");
                System.out.println("2. Snacks");
                System.out.println("3. Exit");
                System.out.print("Enter your choice: ");
                int choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println( "hello");
                        break;
                    case 2:
                        System.out.println("not allowed");
                        break;
                    case 3:
                        System.out.println("Exiting...");
                        running = false;
                        break;
                    default:
                        System.out.println("Invalid choice");
                }
            }
            sc.close();
        }

    }




