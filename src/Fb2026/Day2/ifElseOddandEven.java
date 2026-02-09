package Fb2026.Day2;

import java.util.Scanner;

public class ifElseOddandEven {
    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter The number: ");
        int x = sc.nextInt();

        if (x % 2 ==  0 ){
            System.out.println("Even");
        }else  {
            System.out.println("Odd");
        }



    }
}


/**
 * using a modulo operator [%]
 * x / 2 =  remender =  0  is even
 * x / 2  =! 0 =  is odd
 */