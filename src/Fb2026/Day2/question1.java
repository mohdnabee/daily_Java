package Fb2026.Day2;

import java.util.Scanner;

/**
 *  take input two  number  from user  -> a , b
 *  1)  a =b  equal
 *  2)  a>b a is greater
 *  3) a<b a is lesser
 */

public class question1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number");
        int a =  sc.nextInt();
        System.out.print("enter a number");
        int b =  sc.nextInt();

        if ( a== b){
            System.out.println("Equal");
        } else  {
            if (a>b){
                System.out.println("a is greater than b");
            }else {
                System.out.println("a is less than b");
            }
        }


    }
}
