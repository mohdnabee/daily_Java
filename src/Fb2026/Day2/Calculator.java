package Fb2026.Day2;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner Sc =  new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = Sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = Sc.nextInt();

        System.out.println("Enter The Operator \n  1=  + ,  2 = - . 3=  * ,  4 = / ,  5 =  %");
        int opr =  Sc.nextInt();




        /**  logic
         * 1 -> +
         * 2 -> -
         * 3 -> *
         * 4 -> /
         * 5 -> %
         */


        switch (opr){
            case 1 :
                System.out.println(num1 + num2);
                break;
            case 2:
                System.out.println(num1 - num2);
                break;
                case 3:
                System.out.println(num1 * num2);
                break;
                case 4: if ( num2  == 0){
                    System.out.println("Invalid Division");
                }else {
                    System.out.println(num1 / num2);
                }
                break;

            case 5 : if( num2 == 0){
                    System.out.println("Invalid Division");
                }else {
                    System.out.println(num1 % num2);
                }
                break;

            default:
                System.out.println("Invalid Operator");

        }











    }
}
