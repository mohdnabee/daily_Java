package methods;

import java.util.Scanner;

public class mart1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance = 100000;

        while (true) {
            System.out.println("Welcome to the Mart1!");
            System.out.println("Your balance: $" + balance);
            System.out.println("1. Smart Phones");
            System.out.println("2. laptops");
            System.out.println("3. Snacks");
            System.out.println("4. Exit");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    balance = buyPhone(sc, balance);
                    break;
                case 2 :
                    balance = buyLaptop(sc,balance);
                    break;
                case 3:
                    balance = buySnack(sc, balance);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }

    public static double buyPhone(Scanner sc, double balance) {
        System.out.println("Choose a phone:");
        System.out.println("1. Realme 8 Pro ($300)");
        System.out.println("2. Samsung Galaxy A52 ($400)");
        System.out.println("3. Apple iPhone 13 ($800)");
        System.out.println("4 . Vivo Y15 (&200)");
        int phoneChoice = sc.nextInt();

        switch (phoneChoice) {
            case 1:
                if (balance >= 300) {
                    balance -= 300;
                    System.out.println("You bought Realme 8 Pro!");
                    displayPhoneDetails("Realme 8 Pro", 6, 128,16, 108);
                } else {
                    System.out.println("Insufficient balance");
                }
                break;
            case 2:
                if (balance >= 400) {
                    balance -= 400;
                    System.out.println("You bought Samsung Galaxy A52!");
                    displayPhoneDetails("Samsung Galaxy A52", 8, 128,32, 64);
                } else {
                    System.out.println("Insufficient balance");
                }
                break;
            case 3:
                if (balance >= 800) {
                    balance -= 800;
                    System.out.println("You bought Apple iPhone 13!");
                    displayPhoneDetails("Apple iPhone 13", 6, 256,12, 12);
                } else {
                    System.out.println("Insufficient balance");
                }
                break;

            case 4 :
                if (balance >= 200){
                    balance-= 300;
                    System.out.println("you bought Vivo Y15!");
                    displayPhoneDetails("Vivo Y15", 4,64, 8,16 );
                }

            default:
                System.out.println("Invalid choice");
        }
        return balance;
    }

    public static double buyLaptop(Scanner sc, double balance) {
        System.out.println("Choose a Laptop");
        System.out.println("1. Asus TUf Gaming F15 ($700)");
        System.out.println("2. Asus Vivo book ($500)");

        int LaptopChoice = sc.nextInt();

        switch (LaptopChoice) {
            case 1:
                if (balance >= 700) {
                    balance -= 700;
                    System.out.println("You bought  Asus Tuf Gaming f15 !");
                    dispalyLaptopsDetails("Asus", "Tuf Gaming F 15 ",16, 512,
                            "1650 GTX 4 GB ","GAMING", "intel i5 10gen " );
                } else {
                    System.out.println("Insufficient balance");
                }
                break;
            case 2:
                if (balance >= 500) {
                    balance -= 500;
                    System.out.println("Asus Vivo book ");
                    dispalyLaptopsDetails("Asus", "Vivo book ",8 , 512,
                            "null  ","working", "intel i5 10gen ");
                } else {
                    System.out.println("Insufficient balance");
                }
                break;

            default:
                System.out.println("Invalid choice");
        }
        return balance;
    }


    public static double buySnack(Scanner sc, double balance) {
        System.out.println("Choose a snack:");
        System.out.println("1. Lays Chips ($2)");
        System.out.println("2. Doritos ($3)");
        System.out.println("3. Popcorn ($5)");
        System.out.println("4 . Kurkue ($3)");
        int snackChoice = sc.nextInt();

        switch (snackChoice) {
            case 1:
                if (balance >= 2) {
                    balance -= 2;
                    System.out.println("You bought Lays Chips!");
                } else {
                    System.out.println("Insufficient balance");
                }
                break;
            case 2:
                if (balance >= 3) {
                    balance -= 3;
                    System.out.println("You bought Doritos!");
                } else {
                    System.out.println("Insufficient balance");
                }
                break;
            case 3:
                if (balance >= 5) {
                    balance -= 5;
                    System.out.println("You bought Popcorn!");
                } else {
                    System.out.println("Insufficient balance");
                }
                break;
            case 4:
                if (balance >= 3) {
                    balance -= 3;
                    System.out.println("You bought Kurkue!");
                } else {
                    System.out.println("Insufficient balance");
                }
                break;
            default:
                System.out.println("Invalid choice");
        }
        return balance;
    }

    public static void displayPhoneDetails(String phoneName, int ram, int storage, int frontCamera, int backCamera) {
        System.out.println("Phone: " + phoneName);
        System.out.println("RAM: " + ram + "GB");
        System.out.println("Storage "+storage+ "GB");
        System.out.println("Front Camera: " + frontCamera + "MP");
        System.out.println("Back Camera: " + backCamera + "MP");

    }

    public  static  void dispalyLaptopsDetails(String brand , String name , int ram ,  int ssd , String graphicCard ,String type,
                                               String processor ){
        System.out.println("Brand: "+ brand);
        System.out.println("Vesion: " +name);
        System.out.println("processor: "+ processor);
        System.out.println("Ram: "+ ram+ "GB");
        System.out.println("SSd: "+ ssd+ "GB ");
        System.out.println("Graphic Card: " + graphicCard);
        System.out.println("Type: "+ type);


    }
}


