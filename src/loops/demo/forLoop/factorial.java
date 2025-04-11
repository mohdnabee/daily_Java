package loops.demo.forLoop;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int fact=  sc.nextInt();
        int f = 1;
        for (int  i=1 ; i<=fact; i++){
            f=f*i;}
            System.out.println(f);

    }
}
