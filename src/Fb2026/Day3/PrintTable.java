package Fb2026.Day3;

import java.util.Scanner;

public class PrintTable {
    public static void main(String[] args) {

//          Print the table of a number input by  the user

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        for (int i = 1 ;  i <=  10  ;  i++){

            System.out.println( n + " x " + i + " = "+  i * n);


        }

    }
}
