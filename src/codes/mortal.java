package codes;
import  java.util.*;

public class mortal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("Mortal Kombat Menu");
            System.out.println("1. Outworld");
            System.out.println("2. Mortal Kombat Characters");
            System.out.println("3. Fatalities");
            System.out.println("4 Friendships");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Outworld is a realm in the Mortal Kombat universe.");
                    System.out.println(" Empire of shao khan");
                    System.out.println("King of outworld ");
                    break;
                case 2:
                    System.out.println("Mortal Kombat Characters:");
                    System.out.println("1. Scorpion");
                    System.out.println("2. Sub-Zero");
                    System.out.println("3. Raiden IS ");
                    System.out.println("4. LIU KHANG ");
                    System.out.print("Enter your choice: ");
                    int characterChoice = sc.nextInt();
                    // Add character logic here
                    switch (characterChoice) {
                        case 1:
                            System.out.println("Scorpion");
                            System.out.println("Name: Hanzo Hasashi");
                            System.out.println("Special Move: Spear");
                            System.out.println("Fatality: Get over here!");
                            break;
                        case 2:
                            System.out.println("Sub-Zero");
                            System.out.println("Name: Bi-Han or Kuai Liang");
                            System.out.println("Special Move: Ice Ball");
                            System.out.println("Fatality: Spine Rip");
                            break;
                        case 3:
                            System.out.println("Raiden");
                            System.out.println("Name: God of Thunder");
                            System.out.println("Special Move: Electricity");
                            System.out.println("Fatality: Shout of Thunder");
                            break;
                        default:
                            System.out.println("Invalid choice");
                    }
                    System.out.println();
                    break;

                case 3:
                    System.out.println("Fatalities are finishing moves in Mortal Kombat.");
                    // Add fatality logic here
                    break;
                case 4:
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



