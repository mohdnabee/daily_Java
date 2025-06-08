package loops.demo;
import java.io.*;
import java.util.*;
import java.util.Scanner;

public class series {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int t = in.nextInt(); // Number of test cases

        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            int sum = a;
            int power = 1; // Start with 2^0

            for (int j = 0; j < n; j++) {
                sum += power * b;
                System.out.print(sum + " ");
                power *= 2; // Next power of 2 (no Math.pow used)
            }
            System.out.println(); // Move to the next line after each query
        }

        in.close();
    }
}

