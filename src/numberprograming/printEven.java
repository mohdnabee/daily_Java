package numberprograming;

import java.util.Scanner;
//    WAP to print all even / odd numbers between two given range
public class printEven {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.print("enter the first number: ");
        int m =sc.nextInt();
        System.out.print("enter the second number: ");
        int n = sc.nextInt();


        // even numbers
        System.out.println(m+ " and " +n+ " all even numbers");
        for (int i =m; i<=n; i++){

            if (i%2 ==0){
                System.out.println(i);
            }

        }

        // odd numbers
        System.out.println(m+ " and " +n+ " all odd numbers");
        for (int i =m; i<=n; i++){


            if (i % 2 != 0){
                System.out.println(i);
            }

        }


    }


}
