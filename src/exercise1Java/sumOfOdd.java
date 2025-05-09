package exercise1Java;
//  write a function to print the sum of all odd numbers from 1 to n .

import java.util.Scanner;

public class sumOfOdd {

    // function
    public static void sumOfN(int n){

        int sum =0 ;

        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }

        System.out.println("Sum of odd numbers from 1 to " + n + " is: " + sum);

    }


    public static void main(String[] args) {

        sumOfN(10);

    }
}
