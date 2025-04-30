package function;

import java.util.Scanner;

// Make a function to print the table of a given number n
public class function4table {

    public static  void   table(int n) {

        //  make a table using the loop

        for (int i=1 ; i<=10; i++){
            System.out.println(n + " x " + i + " = " + (n * i));
        }

      return;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        table(n);



    }
}
