package Fb2026.Day2;

import java.util.Scanner;

public class ElseIfState {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number ");
        int a =  sc.nextInt();
        System.out.print("enter a number ");
        int b =  sc.nextInt();


        if (a== b){
            System.out.println("Equal");
        } else if (a>b) {
            System.out.println("a is greater");
        }else {
            System.out.println("a is lesser");
        }


    }
}


/**
 * if (condition 1) {
 *     stt1;
 *     stt2;
 * }
 * else if (condition2) {
 *     stt3;
 *     stt4 ;
 * }
 * else{
 *     stt5;
 *     stt6;
 * }
 */