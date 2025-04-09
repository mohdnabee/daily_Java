package conditionalStatements.ifElseSatements;

import java.util.*;

public class conditional_First {
    public static void main (String[] arg) {

        Scanner sc = new Scanner(System.in);
//        int age = sc.nextInt();
//        if (age > 18){
//            System.out.println("Adult");
//        }else {
//            System.out.println(" not Adult");
//        }

        // check the even and odd
        int x = sc.nextInt();

        if (x % 2 == 0) {
            System.out.println("Even");
        }else {
            System.out.println("odd");
        }
    }

}
