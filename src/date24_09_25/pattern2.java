package date24_09_25;

import java.util.Scanner;

public class pattern2 {
    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int n =  sc.nextInt();


        for (int i=n ; i>=1; i--){  //  outer loop
            for (int j =1; j<=i; j++){// inner loop
                System.out.print("$");
            }
            System.out.println();
        }

    }
}
