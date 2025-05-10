package loops.demo.do_whileLoop;

import java.util.Scanner;

public class countsuser {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int positiveCount =  0;
        int negativeCount = 0;
        int ZerosCount =0;

        char choice ;

        do {
            System.out.print("enter a number: ");
            int number = scanner.nextInt();

            if (number >0 ){
                positiveCount++;
            }else if (number <0 ){
                negativeCount++;
            }else {
                ZerosCount ++;
            }
            System.out.println("Do you want to enter another number? (y/n): ");
            choice = scanner.next().charAt(0);
        } while (choice == 'y' || choice == 'Y');

        System.out.println("\n--- Result ---");
        System.out.println("Positive numbers: " + positiveCount);
        System.out.println("Negative numbers: " + negativeCount);
        System.out.println("Zeros: " + ZerosCount );


    }
}
