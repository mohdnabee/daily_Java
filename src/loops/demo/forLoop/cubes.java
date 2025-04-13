package loops.demo.forLoop;

import java.util.Scanner;

public class cubes {
    public static void main(String[] args) {

        int i , n ;
        System.out.print("Input Number of terms: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for (i =  1 ;  i <= n ; i++ ){
            System.out.println("Cube of : "+i);
            System.out.println("number is : "+ i + " and cube of " +i + " is "+ (i*i*i));


        }

    }
}
