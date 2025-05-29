package recursionJAVA;

import java.util.Scanner;

public class guestRecursion {

    public  static  int guest(int n){
        //  base case
        if (n <= 1 ){
            return 1;
        }


        //  single
        int way1 =  guest(n-1);

        //  double
        int way2 = (n-1)* guest(n-2);

        return  way1 + way2;
    }

    public static void main(String[] args) {

        Scanner  sc  =  new Scanner(System.in);
        System.out.print("Enter the value of guest:  ");
        int n  = sc.nextInt();

        System.out.println( "Total ways of calls guest is : "+guest(n));

    }
}
