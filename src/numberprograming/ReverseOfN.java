package numberprograming;

import java.util.Scanner;

// 3.	WAP to print 'n' natural numbers in reverse order
public class ReverseOfN {

    public static void main(String[] args) {

        Scanner num =  new Scanner(System.in);
        System.out.print("Enter an Integer  number ");
        int number =  num.nextInt();

        System.out.print("natural numbers in reverse order: ");
        for (int i = number; i>=1;i--){
            System.out.print(i+ " ");
        }
        System.out.println();


    }
}
