package loops.demo.forLoop;

import java.util.*;
// lecture 4 done
public class demoTable {
    public static void main (String [] args){

        // print the table of a number input by the user

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i<11; i++){
            System.out.println("2X" +i+"="+ i*n);
        }
    }
}
