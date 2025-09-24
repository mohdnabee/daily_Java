package date24_09_25;

import java.util.Scanner;

public class Patterns1 {
    public static void main(String[] args) {

        //  input  user
        Scanner input =  new Scanner(System.in);
        System.out.print("Enter the Value : ");
        int n =  input.nextInt();


//        int n=  5 ;

       for (int i=0; i<=n; i++){
           for(int j=1;j<=i;j++){
               System.out.print("#");
           }
           System.out.println();

        }

    }
}
