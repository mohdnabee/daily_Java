package loops.demo.forLoop;

import java.util.*;

public class demoForSum {
    public static void main (String [] args ){

        // Q) print the sum of first n natural number eg :- n = 4
        // using a for loop

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = 0;

        for (int i= 0; i<=n;i++){
           sum = sum+i;
        }

        System.out.println(sum);
    }
}
