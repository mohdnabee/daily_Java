package loops.demo.forLoop.Pattern;

import java.util.Scanner;

public class ButterflyPattern {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();

        //   upper half
        for (int i = 1; i <= n; i++) {

            // 1 st part
            for (int j =1 ; j<=i; j++){
                System.out.print("*");
            }

            int  spaces  = 2*(n-i);
            for (int j =1 ; j<=spaces; j++){
                System.out.print(" ");
            }

            // 2nd part of upper half
            for (int j =1 ; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();

        }

        //  lower half
        for (int i = n; i>=1; i--) {
            // 1 st part

            for (int j =1 ; j<=i; j++){
                System.out.print("*");
            }
            int  spaces  = 2*(n-i);
            for (int j =1 ; j<=spaces; j++){
                System.out.print(" ");
            }
            // 2nd part of upper half
            for (int j =1 ; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();

        }


        System.out.println();
        System.out.println("A hollow butterfly pattern");

        //  upper 1st half
        for ( int i = 1;  i<=n ; i++){
            for (int j =1 ; j<=i; j++){

                if(i == 1 || j == 1 || i ==i-n || j == i  ){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }

            int  spaces  = 2*(n-i);
            for (int j =1 ; j<=spaces; j++){
                System.out.print(" ");
            }

            // 2nd part of upper half
            for (int j =1 ; j<=i;j++){

                if(i == 1 || j == 1 || i ==i-n || j == i  ){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }

//  lower half
        for (int i = n; i>=1; i--) {
            // 1 st part

            for (int j =1 ; j<=i; j++){
                if(i == 1 || j == 1 || i ==i-n || j == i  ){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            int  spaces  = 2*(n-i);
            for (int j =1 ; j<=spaces; j++){
                System.out.print(" ");
            }
            // 2nd part of upper half
            for (int j =1 ; j<=i;j++){
                if(i == 1 || j == 1 || i ==i-n || j == i  ){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }

    }
}
