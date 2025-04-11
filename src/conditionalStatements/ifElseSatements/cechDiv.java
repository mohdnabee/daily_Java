package conditionalStatements.ifElseSatements;

import java.util.Scanner;

public class cechDiv {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  2 Number");
        int a = sc.nextInt();
        int b=  sc.nextInt();

        if ( a%b == 0  ){
            System.out.println(a + " is divisible by "+b);
        }else{
            System.out.println(a + " is  not divisible by "+b);
        }



    }
}
