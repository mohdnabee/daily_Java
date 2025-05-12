package codes;
import  java.util.*;
//   MARTIAL ARTISTS / NETHERRELAM // ELDER GOD // NOMAD // OUTWORLD // SPEC OPS 2
public class mortal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("Mortal Kombat Menu");
            System.out.println("1. Outworld");
            System.out.println("2. Mortal Kombat Characters");
            System.out.println("3. Brutality");
            System.out.println("4 Friendships");
            System.out.println("5. Exit");
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
                            System.out.println("MK11 Scorpion");
                            System.out.println("Name: Hanzo Hasashi");
                            System.out.println("class : MARTIAL ARTISTS / NETHERRELAM");
                            System.out.println("Special Move1 : HELL'S SPEAR");
                            System.out.println("Special Move2 : Death Spin");
                            System.out.println("Special Move3 : GET OVER HERE!");
                            break;
                        case 2:
                            System.out.println(" MK 11Sub-Zero");
                            System.out.println("Name: Bi-Han or Kuai Liang");
                            System.out.println("class : MARTIAL ARTISTS ");
                            System.out.println("Special Move1 : Icicle Burst");
                            System.out.println("Special Move2 : breaking the Ice");
                            System.out.println("Special Move3 : Axe the Question!");
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
                case 5:
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



