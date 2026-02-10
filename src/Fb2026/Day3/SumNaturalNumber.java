package Fb2026.Day3;

import java.util.Scanner;

public class SumNaturalNumber {
    public static void main(String[] args) {

//          print the sum  of First n natural  Numbers .

//          using a for loop
        Scanner sc = new Scanner(System.in);

        int n =  sc.nextInt() ;
        int sum  = 0;


        for (int i = 1 ;  i<=n ; i++){
            sum= sum + i ;
        }

        System.out.println(sum);

    }

}
